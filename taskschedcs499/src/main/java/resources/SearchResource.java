package resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import models.Appointment;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.annotation.security.DenyAll;
import jakarta.annotation.security.PermitAll;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.InternalServerErrorException;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.SecurityContext;
import org.eclipse.microprofile.jwt.Claim;
import org.eclipse.microprofile.jwt.Claims;
import org.eclipse.microprofile.jwt.JsonWebToken;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import Repository.AppointmentRepository;

/*Search Endpoint
 * Testing Filtering for searches
 * */

@Path("/search")
//@RolesAllowed({"User", "Admin"})
public class SearchResource {
	
	@Inject
	JsonWebToken jwtWebToken;
	
	@Inject
	AppointmentRepository appointmentRepository;
	
	@GET
	@Path("/file")
	//@RolesAllowed({"User", "Admin"})
	@Produces(MediaType.TEXT_HTML)
	public String getSearch() throws Exception {
		return Files.readString(Paths.get("src/main/resources/META-INF/resources/Search.html"));
	}
	
	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchAppointments(
		@QueryParam("appoint") String appoint,
		@QueryParam("name") String name,
		@QueryParam("dsp") String dsp,
		@QueryParam("datetime") String datetime,
		@QueryParam("page") @DefaultValue("0") int page,
		@QueryParam("size") @DefaultValue("10") int size) {
		
		List<Appointment> results = appointmentRepository.searchAppointments(appoint, name, dsp, datetime, page, size);
		
		if (results.isEmpty()) {
			return Response.status(Response.Status.NOT_FOUND)
					.entity("No Results Found")
					.build();
		}
		
		return Response.ok(results).build();
	}

}
