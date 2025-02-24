package resources;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

import Repository.UserRepository;
import at.favre.lib.crypto.bcrypt.BCrypt;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import models.User;
import models.UserLoginRequest;
import models.UserRegisterRequest;
import services.JWTTokenGeneration;
import services.JwtResponse;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/auth")
public class AuthResource {

    @Inject
    UserRepository userRepository;  // Injecting the UserRepository

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(UserLoginRequest request) {
        // Validate user (e.g., check username/password in DB)
        User user = userRepository.findByUsername(request.getUsername());

        if (user != null && validatePassword(request.getPassword(), user.getPassword())) {
            // Generate JWT token
            String token = JWTTokenGeneration.generateToken(request.getUsername());
            return Response.ok(new JwtResponse(token)).build();
        }

        // Unauthorized response if user is invalid
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }

    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response register(UserRegisterRequest request) {
        // Check if username already exists
        if (userRepository.existsByUsername(request.getUsername())) {
            return Response.status(Response.Status.CONFLICT).entity("Username already exists").build();
        }

        // Hash the password before saving
        String hashedPassword = hashPassword(request.getPassword());
        
        //role default
        Set<String> roles = (request.getRoles() != null && !request.getRoles().isEmpty()) ? request.getRoles() : Set.of("User");

        // Save the new user
        User newUser = new User(request.getUsername(), hashedPassword, roles);
        userRepository.persist(newUser);

        // Generate JWT token for the new user (optional)
        String token = JWTTokenGeneration.generateToken(request.getUsername());

        // Return response with the token
        return Response.status(Response.Status.CREATED).entity(new JwtResponse(token)).build();
    }

    private boolean validatePassword(String inputPassword, String storedHashedPassword) {
        return BCrypt.verifyer().verify(inputPassword.toCharArray(), storedHashedPassword.getBytes()).verified;
    }

    private String hashPassword(String password) {
    	return BCrypt.withDefaults().hashToString(12, password.toCharArray());

    }
    @GET
    @Path("/login")
    @Produces(MediaType.TEXT_HTML)
    public String serveLoginPage() throws Exception {
        return Files.readString(Paths.get("src/main/resources/META-INF/resources/login.html"));  // Path to login.html
    }
    @GET
    @Path("/register")
    @Produces(MediaType.TEXT_HTML)
    public String serveRegisterPage() throws Exception {
    	return Files.readString(Paths.get("src/main/resources/META-INF/resources/register.html")); // Path to register.html
    }
    
    @GET
    @Path("/home")
    @Produces(MediaType.TEXT_HTML)
    //@RolesAllowed({"User", "Admin"})
    public String serveHomePage() throws Exception {
        return Files.readString(Paths.get("src/main/resources/META-INF/resources/home.html"));
    }
}

