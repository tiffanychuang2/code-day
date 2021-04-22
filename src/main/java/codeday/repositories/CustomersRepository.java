package codeday.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import codeday.models.Customers;

public interface CustomersRepository extends CrudRepository<Customers, Integer> {
	
	Customers findByName(String name);
	
	List<Customers> findAll();
	
	Customers findById(int id);

}
