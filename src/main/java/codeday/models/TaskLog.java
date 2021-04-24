package codeday.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class TaskLog {
	
	@Id
	@GeneratedValue
	private int taskLogId;
//	private int taskId;
//	private int userId;
	public int durationMinutes;
	public Long startTime;
	public Long stopTime;
			
	@ManyToOne
	Task taskId;
	
	@ManyToOne
	User userId;
	
	@ManyToMany(mappedBy = "tasksForTasklogs")
	private Set<Task> tasklogsForTasks;
	
	@ManyToMany(mappedBy = "usersForTasklogs")
	private Set<User> tasklogsForUsers;
	
	public TaskLog() {
		
	}
	
	public TaskLog(Task taskId, User userId, int durationMinutes, Long startTime, Long stopTime) {
		this.taskId = taskId;
		this.userId = userId;
		this.durationMinutes = durationMinutes;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}
	
	public int getTaskLogId() {
		return taskLogId;
	}
	
	public Task getTaskId() {
		return taskId;
	}
	
	public User getUserId() {
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
	
	public void setTaskLogId(int taskLogId) {
		this.taskLogId = taskLogId;
	}
	
	public void setTaskId(Task taskId) {
		this.taskId = taskId;
	}
	
	public void setUserId(User userId) {
		this.userId = userId;
	}
	
//	public void setDurationMinutes(Task taskId, User userId, long durationMinutes) {
//		this.taskId = taskId;
//		this.userId = userId;
//		this.durationMinutes = durationMinutes;
//		
//	}
	
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	
	public void setStopTime(Long stopTime) {
		this.stopTime = stopTime;
	}
	
	@Override
	public String toString() {
		return durationMinutes;
	}

}
