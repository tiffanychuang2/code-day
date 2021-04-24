package codeday.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Task {
	
	@Id
	@GeneratedValue
	private int taskId;
	private String description;
//	private int projectId;
	
	@ManyToOne
	Project projectId;
	
	@ManyToMany(mappedBy = "projectsForTasks")
	private Set<Project> tasksForProjects;
	
	@ManyToMany
	private Set<TaskLog> tasksForTasklogs;
	
	protected Task() {
		
	}
	
	public Task(String description, Project projectId) {
		this.description = description;
		this.projectId = projectId;
	}
	
	public int getTaskId() {
		return taskId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Project getprojectId() {
		return projectId;
	}
	
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}
	
	@Override
	public String toString() {
		return description + " " + projectId;
	}

}
