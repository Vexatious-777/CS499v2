package resources;

import jakarta.inject.Inject;
//import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
//import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import models.Appointment;
import org.bson.types.ObjectId;

import Repository.AppointmentRepository;

//import io.quarkus.mongodb.panache.PanacheMongoEntity;
//import io.quarkus.mongodb.panache.common.MongoEntity;
//TODO: might need this later import org.bson.types.ObjectId; if Panache's auto-ID's don't work

//import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

//Rest Endpoints

@Path("/search")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AppointmentResource {
	
	@Inject
	AppointmentRepository appointmentRepository;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createAppointment(Appointment appointment) {
		System.out.println("Received Appointment: " + appointment);
		
		if (appointment == null || appointment.name == null || appointment.datetime == null || appointment.dsp == null) {
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Entry").build();
		}
		
		appointment.persist();
		return Response.status(Response.Status.CREATED).entity(appointment).build();
	}
	
	@GET
	@Path("/all")
	public List<Appointment> getAppointments() {
		return Appointment.listAll();
	}
	
	@GET
	@Path("/{id}")
	public Appointment getById(@PathParam("id") ObjectId id) {
		return Appointment.findById(id);
	}
	
	@GET
	@Path("/byName/{name}")
	public List<Appointment> getByName(@PathParam("name") String name) {
		return Appointment.find("name", name).list();
	}
	
	@GET
	@Path("/byDate/{dateTime}")
	public List<Appointment> getByDate(@PathParam("datetime") String datetime) {
		return Appointment.find("dateTime",LocalDateTime.parse(datetime)).list();
	}
	
	@GET
	@Path("/byAppoint/{appoint}")
	public List<Appointment> getByAppoint(@PathParam("appoint") String appoint) {
		return Appointment.find("appoint", appoint).list();
	}
	
	@DELETE
	@Path("/delete/{id}")
	public Response deleteAppointment(@PathParam("id") String id) {
		boolean deleted = Appointment.deleteById(new ObjectId(id));
		return deleted ? Response.noContent().build(): Response.status(Response.Status.NOT_FOUND).build();
	}
	
	/*TODO:Getting Tired and finally got my database to actually work properly
	 * camel case actually messed me up here datetime and dateTime was a brutal mistake
	 * For the algorithm I need to look up more on MongoDB aggregation pipeline may be 
	 * able to replace alot of this search logic, While also satisfying 
	 * Data Structure/Algorithmic needs.*/

}
