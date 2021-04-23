package codeday.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import codeday.models.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {
	
	List<Task> findAll();
	
	Task findById(int id);
	
	Task findByDescription(String description);

}
