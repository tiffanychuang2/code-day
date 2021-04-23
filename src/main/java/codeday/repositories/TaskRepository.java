package codeday.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import codeday.models.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {
	
	Task findByDescription(String description);
	
	Task findById(int id);
	
	List<Task> findAll();

}
