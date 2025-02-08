package Repository;

import jakarta.enterprise.context.ApplicationScoped;
import models.Appointment;
import org.bson.types.ObjectId;

/*
 * Manages Data Persistence
 * Querying
 * Clean API for operations without database being exposed
 * TODO: Plan to look up MongoDB aggregation pipeline check AppointmentResource
 * Will more than likely finally make use of this class or decide on it's removal mattering on needs
 * */

import io.quarkus.mongodb.panache.PanacheMongoRepository;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class AppointmentRepository implements PanacheMongoRepository<Appointment> {
	

}
