package io.yadnyesh.cardatabase.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ownerid;
	private String firstname;
	private String lastName;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name="car_owner", joinColumns = {@JoinColumn(name="ownerid")}, inverseJoinColumns = {@JoinColumn(name="id")})
	private Set<Car> cars = new HashSet<Car>(0);
	
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
	
	public Set<Car> getCars() {
		return cars;
	}
	
	public void setCars(Set<Car> cars) {this.cars = cars;}
}
