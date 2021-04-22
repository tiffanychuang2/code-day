package codeday;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Integer> {
	
	Customers findByName(String name);
	List<Customers> findAll();
	
	Customers findById(int id);

}
