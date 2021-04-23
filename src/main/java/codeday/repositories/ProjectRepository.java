package codeday.repositories;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

//import codeday.models.Customers;
import codeday.models.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
	
	Project findByName(String name);
	
	Project findById(int id);
	
	List<Project> findAll();
	
}
