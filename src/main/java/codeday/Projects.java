package codeday;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Projects {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private int customerId;
	@Column
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
	
	@Override
	public String toString() {
		return id + " " + customerId + " " + name;
	}

}
