package Repository;

import models.User;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import java.util.Optional;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheMongoRepository<User> {
	
	public User findByUsername(String username) {
		return find("username", username).firstResult();
	}
	
	public void saveUser(User user) {
		persist(user);
	}
	
	public boolean existsByUsername(String username) {
		return find("username", username).count() > 0;
	}
}
