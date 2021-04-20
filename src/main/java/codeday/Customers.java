package codeday;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customers {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	protected Customers() {
		
	}
	
	public Customers(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%d, name='%s']",
	        id, name);
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

}
