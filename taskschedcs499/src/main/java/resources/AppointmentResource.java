package resources;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import models.Appointment;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.time.LocalDateTime;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

import Repository.AppointmentRepository;




//Rest Endpoints

@Path("/api/appointments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@RolesAllowed({"Admin", "User"})
public class AppointmentResource {
	
	@Inject
	AppointmentRepository appointmentRepository;
	
	@POST
	public Response createAppointment(Appointment appointment) {
		System.out.println("Received Appointment: " + appointment);
		
		if (appointment == null || appointment.name == null || appointment.datetime == null || appointment.dsp == null) {
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Entry").build();
		}
		
		appointment.persist();
		return Response.status(Response.Status.CREATED).entity(appointment).build();
	}
	/*
	 * Below is the CSV file parser to enable uploads of appointment forms en masse*/
	@POST
	@Path("/upload-form")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	//@RolesAllowed({"Admin", "User"})
	public Response uploadCSV(@FormParam("file") InputStream fileInputStream) {
		try (CSVParser csvParser = new CSVParser(new InputStreamReader(fileInputStream), CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase())) {
			for (CSVRecord record : csvParser) {
				Appointment appointment = new Appointment(
						record.get("Appointment"),
						record.get("name"),
						record.get("Description"),
						LocalDateTime.parse(record.get("datetime"))
						);
				appointment.persist();
			}
			return Response.status(Response.Status.CREATED).entity("Appointments Uploaded").build();
		} catch (IOException e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Form Upload failed").build();
			}
	}
}
