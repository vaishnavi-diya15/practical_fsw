package Repository;

import Entity.entity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends MongoRepository<entity, String>{

}
