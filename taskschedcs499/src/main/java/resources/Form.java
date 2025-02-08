package resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.nio.file.Files;
import java.nio.file.Paths;

@Path("/form")
public class Form {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getForm() throws Exception {
		return Files.readString(Paths.get("src/main/resources/form.html"));
	}

}
