package codeday.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Task {
	
	@Id
	@GeneratedValue
	private int id;
	private String description;
	private int projectId;
	
	@ManyToMany(mappedBy = "projectsForTasks")
	private Set<Project> tasksForProjects;
	
	@ManyToMany
	private Set<TaskLog> tasksForTasklogs;
	
	protected Task() {
		
	}
	
	public Task(String description, int projectId) {
		this.description = description;
		this.projectId = projectId;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getprojectId() {
		return projectId;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
	@Override
	public String toString() {
		return description + " " + projectId;
	}

}
