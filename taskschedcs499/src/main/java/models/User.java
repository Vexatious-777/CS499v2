package models;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
import org.bson.types.ObjectId;

@MongoEntity(collection="users")
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class User extends PanacheMongoEntity {
	private String username;
	private String password;
	private Set<String> roles;
	
	@Override
	public String toString() {
		return "User{id=" + id + ", username='" + username + "', roles=" + roles + "}";
	}
}
