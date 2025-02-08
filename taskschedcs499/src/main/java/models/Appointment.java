package models;

import java.time.LocalDateTime;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.*; // TODO: might not be needed here anymore


/**
 * Example JPA entity defined as a Panache Entity.
 * An ID field of Long type is provided, if you want to define your own ID field extends <code>PanacheEntityBase</code> instead.
 *
 * This uses the active record pattern, you can also use the repository pattern instead:
 * .
 *
 * Usage (more example on the documentation)
 *
 * {@code
 *     public void doSomething() {
 *         MyEntity entity1 = new MyEntity();
 *         entity1.field = "field-1";
 *         entity1.persist();
 *
 *         List<MyEntity> entities = MyEntity.listAll();
 *     }
 * }
 * 
 *  future me if not already obvious this package is for Data models however this should be the only
 *  one needed .... should
 *  
 *  TODO: clean up imports on all classes
 *  Attack Repository and Resource classes
 **/

@MongoEntity(collection="appointments")
@Data //TODO: need to look more into this might lead to issues later (Hash Map?)
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Appointment extends PanacheMongoEntity {
	
    public String appoint; //name of appointment
    
    public String name; // name of appointee
    
    public String dsp; // description of appointment
    
    public LocalDateTime datetime; // Time of appointment
    
}
