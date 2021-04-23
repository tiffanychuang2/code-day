package codeday.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import codeday.models.TaskLog;

public interface TaskLogRepository extends CrudRepository<TaskLog, Integer> {
	
	List<TaskLog> findAll();
	
	TaskLog findById(int id);

}
