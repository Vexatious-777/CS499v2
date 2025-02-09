package Repository;

import jakarta.enterprise.context.ApplicationScoped;
import models.Appointment;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.bson.conversions.Bson;

import com.mongodb.client.model.Filters;
import com.mongodb.client.MongoCollection;

import java.util.ArrayList;
import java.util.List;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;



/*
 * Manages Data Persistence
 * Querying
 * Clean API for operations without database being exposed
 * TODO: MongoDB aggregation pipeline is very sensitive to type mismatch
 * Also when applying full-text
 * */



@ApplicationScoped
public class AppointmentRepository implements PanacheMongoRepository<Appointment> {
	
	public List<Appointment> searchAppointments(String appoint, String name, String dsp, String datetime, int page, int size) {
		MongoCollection<Appointment> collection = mongoCollection();
		
		List<Bson> filters = new ArrayList<>();
		
		if (appoint != null && !appoint.isEmpty()) {
			filters.add(Filters.regex("appoint", appoint, "i"));
		}
		if (name != null && !name.isEmpty()) {
			filters.add(Filters.regex("name", name, "i"));
		}
		if (dsp != null && !dsp.isEmpty()) {
			filters.add(Filters.regex("dsp", dsp, "i"));
		}
		if (datetime != null && !datetime.isEmpty()) {
			LocalDateTime dateTimeFilter = LocalDateTime.parse(datetime);
			filters.add(Filters.eq("datetime", dateTimeFilter));
		}
		
		Bson filter = filters.isEmpty() ? Filters.exists("_id") : Filters.and(filters);
		
		return collection.find(filter)
				.skip(page * size)
				.limit(size)
				.into(new ArrayList<>());
	}
}
