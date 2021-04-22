package codeday.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import codeday.models.Projects;

public interface ProjectsRepository extends CrudRepository<Projects, Integer> {
	
	Projects findByName(String name);
	
	List<Projects> findAll();
	
	Projects findById(int id);

}
