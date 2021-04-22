package codeday.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TaskLogs {
	
	@Id
	@GeneratedValue
	private int id;
	private int taskId;
	private int userId;
	private int durationMinutes;
	
	@ManyToMany(mappedBy = "tasksForTasklogs")
	private Set<Tasks> tasklogsForTasks;
	
	@ManyToMany(mappedBy = "usersForTasklogs")
	private Set<Users> tasklogsForUsers;
	
	protected TaskLogs() {
		
	}
	
	public TaskLogs(int taskId, int userId, int durationMinutes) {
		this.taskId = taskId;
		this.userId = userId;
		this.durationMinutes = durationMinutes;
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
	
	@Override
	public String toString() {
		return id + " " + taskId + " " + userId + " " + durationMinutes;
	}

}
