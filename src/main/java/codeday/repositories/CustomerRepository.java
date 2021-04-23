package codeday.repositories;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import codeday.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	Customer findByName(String name);
	Customer findById(int id);
	
	List<Customer> findAll();
	
//	Optional<Customers> findById(int id);

}
