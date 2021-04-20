package codeday;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tasks {
	
	@Id
	@GeneratedValue
	private int id;
	private String description;
	private int projectId;
	
	protected Tasks() {
		
	}
	
	public Tasks(int id, String description, int projectId) {
		this.id = id;
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

}
