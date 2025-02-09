package services;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import java.time.LocalDateTime;
import java.util.List;
import jakarta.enterprise.context.ApplicationScoped;
import models.Appointment;


@ApplicationScoped
public class AppointmentService implements PanacheMongoRepository<Appointment> {

	//TODO: might implement other things here Placeholder still stands

}
