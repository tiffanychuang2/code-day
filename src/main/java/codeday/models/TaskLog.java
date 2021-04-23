package codeday.models;

import java.sql.Timestamp;
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
	private int durationMinutes;
	private Timestamp startTime = null;
	private Timestamp stopTime = null;
	
	@ManyToMany(mappedBy = "tasksForTasklogs")
	private Set<Task> tasklogsForTasks;
	
	@ManyToMany(mappedBy = "usersForTasklogs")
	private Set<User> tasklogsForUsers;
	
	protected TaskLog() {
		
	}
	
	public TaskLog(int taskId, int userId, int durationMinutes, Timestamp startTime, Timestamp stopTime) {
		this.taskId = taskId;
		this.userId = userId;
		this.durationMinutes = durationMinutes;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}
	
//	@Id
//	@GeneratedValue
//	private int id;
//	private int durationMinutes;
//	
//	@ManyToMany(mappedBy = "tasksForTasklogs")
//	private Set<Tasks> tasklogsForTasks;
//	
//	@ManyToMany(mappedBy = "usersForTasklogs")
//	private Set<Users> tasklogsForUsers;
//	
//	@ManyToOne
//	private Tasks taskId;
//	
//	@ManyToOne
//	private Users userId;
//	
//	protected TaskLogs() {
//		
//	}
//	
//	public TaskLogs(Tasks taskId, Users userId, int durationMinutes) {
//		this.taskId = taskId;
//		this.userId = userId;
//		this.durationMinutes = durationMinutes;
//	}
	
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
	
	public Timestamp getStartTime() {
		return startTime;
	}
	
	public Timestamp getStopTime() {
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
	
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	
	public void setStopTime(Timestamp stopTime) {
		this.stopTime = stopTime;
	}
	
	@Override
	public String toString() {
		return id + " " + taskId + " " + userId + " " + durationMinutes;
	}

}
