package codeday;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Projects {
	
	@Id
	@GeneratedValue
	private int id;
	private int customerId;
	private String name;
	
	protected Projects() {
		
	}
	
	public Projects(int id, int customerId, String name) {
		this.id = id;
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

}
