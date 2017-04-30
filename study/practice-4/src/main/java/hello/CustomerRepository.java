package hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

/**
 * Created by asxat on 2/25/17.
 */

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}
