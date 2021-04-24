package codeday.models;

import java.util.Set;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
public class Project {
	
	@Id
	@GeneratedValue
	private int projectId;
//	private int customerId;
	private String name;
	
	@ManyToOne
	Customer customerId;
	
	@ManyToMany(mappedBy = "customersForProjects")
	private Set<Customer> projectsForCustomers;
	
	@ManyToMany
	private Set<Task> projectsForTasks;
	
	protected Project() {
		
	}
	
	public Project(Customer customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}
	
	public int getProjectId() {
		return projectId;
	}
	
	public Customer getCustomerId() {
		return customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
