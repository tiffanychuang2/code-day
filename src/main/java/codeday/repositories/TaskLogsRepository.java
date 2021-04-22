package codeday.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import codeday.models.TaskLogs;

public interface TaskLogsRepository extends CrudRepository<TaskLogs, Integer> {
	
	List<TaskLogs> findAll();
	
	TaskLogs findById(int id);

}
