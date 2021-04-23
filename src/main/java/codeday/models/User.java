package codeday.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToMany
	private Set<TaskLog> usersForTasklogs;
	
	protected User() {
		
	}
	
	public User(int id) {
		this.id= id;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}



