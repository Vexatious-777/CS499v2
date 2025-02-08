package services;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import java.time.LocalDateTime;
import java.util.List;
import jakarta.enterprise.context.ApplicationScoped;
import models.Appointment;


//Business logic

@ApplicationScoped
public class AppointmentService implements PanacheMongoRepository<Appointment> {
	
    public List<Appointment> findByAppoint(String appoint) {
    	return find("appoint", appoint).list();
    }
    
    public List<Appointment> findByDateTime(LocalDateTime dateTime) {
    	return find("dateTime", dateTime).list();
    }
    
    public List<Appointment> findByName(String name){
    	return find("name", name).list();
    }

}
