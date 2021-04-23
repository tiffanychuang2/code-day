package codeday.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@ManyToMany
	private Set<Project> customersForProjects;
	
	protected Customer() {
		
	}
	
	public Customer(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}

//	@Override
//	  public String toString() {
//	    return String.format(
//	        "Customer[id=%d, name='%s']",
//	        id, name);
//	  }

}
