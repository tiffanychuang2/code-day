package codeday.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Users {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToMany
	private Set<TaskLogs> usersForTasklogs;
	
	protected Users() {
		
	}
	
	public Users(int id) {
		this.id= id;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}



