package codeday.repositories;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import codeday.models.TaskLog;

public interface TaskLogRepository extends CrudRepository<TaskLog, Integer> {
	
	TaskLog findByTaskId(int taskId);
	
	TaskLog findById(int id);
	
	List<TaskLog> findAll();

}
