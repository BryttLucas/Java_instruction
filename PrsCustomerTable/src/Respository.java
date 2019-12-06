import org.springframework.data.repository.CrudRepository;

public interface Respository {
	public interface CustomerRepository extends CrudRepository<Customer, Integer>
}
