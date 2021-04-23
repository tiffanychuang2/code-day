package codeday.models;

import java.util.Set;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.Table;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int customerId;
	private String name;
	
	@ManyToMany(mappedBy = "customersForProjects")
	private Set<Customer> projectsForCustomers;
	
	@ManyToMany
	private Set<Task> projectsForTasks;
	
	protected Project() {
		
	}
	
	public Project(int customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return customerId + " " + name;
	}

}
