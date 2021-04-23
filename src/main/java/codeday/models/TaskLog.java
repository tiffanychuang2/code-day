package codeday.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TaskLog {
	
	@Id
	@GeneratedValue
	private int id;
	private int taskId;
	private int userId;
	public int durationMinutes;
	public Long startTime;
	public Long stopTime;
			
	@ManyToMany(mappedBy = "tasksForTasklogs")
	private Set<Task> tasklogsForTasks;
	
	@ManyToMany(mappedBy = "usersForTasklogs")
	private Set<User> tasklogsForUsers;
	
	public TaskLog() {
		
	}
	
	public TaskLog(int taskId, int userId, int durationMinutes, Long startTime, Long stopTime) {
		this.taskId = taskId;
		this.userId = userId;
		this.durationMinutes = durationMinutes;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}
	
	public int getId() {
		return id;
	}
	
	public int getTaskId() {
		return taskId;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public int getDurationMinutes() {
		return durationMinutes;
	}
	
	public Long getStartTime() {
		return startTime;
	}
	
	public Long getStopTime() {
		return stopTime;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}
	
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	
	public void setStopTime(Long stopTime) {
		this.stopTime = stopTime;
	}
	
	@Override
	public String toString() {
		return id + " " + taskId + " " + userId + " " + durationMinutes +  " " + startTime + " " + stopTime;
	}

}
