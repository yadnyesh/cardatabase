package io.yadnyesh.cardatabase.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ownerid;
	private String firstname;
	private String lastName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private List<Car> cars;
	
	public Owner() {
	}
	
	public Owner(String firstname, String lastName) {
		this.firstname = firstname;
		this.lastName = lastName;
	}
	
	public long getOwnerid() {
		return ownerid;
	}
	
	public void setOwnerid(long ownerid) {
		this.ownerid = ownerid;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setOwnerid(Long ownerid) {
		this.ownerid = ownerid;
	}
	
	public List<Car> getCars() {
		return cars;
	}
	
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
}
