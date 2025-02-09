package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import models.Appointment;

import Repository.AppointmentRepository;

//import io.quarkus.mongodb.panache.PanacheMongoEntity;
//import io.quarkus.mongodb.panache.common.MongoEntity;
//TODO: might need this later import org.bson.types.ObjectId; if Panache's auto-ID's don't work


//Rest Endpoints


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
}
