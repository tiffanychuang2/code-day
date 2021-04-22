package codeday.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import codeday.models.Tasks;

public interface TasksRepository extends CrudRepository<Tasks, Integer> {
	
	List<Tasks> findAll();
	
	Tasks findById(int id);

}
