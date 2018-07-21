package io.yadnyesh.cardatabase.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
//	@ManyToMany(cascade = CascadeType.MERGE)
//	@JoinTable(name="car_owner", joinColumns = {@JoinColumn(name="ownerid")}, inverseJoinColumns = {@JoinColumn(name="id")})
//	private Set<Car> cars = new HashSet<Car>(0);

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	@JsonIgnore
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Car> cars;

	public Owner() {
	}
	
	public Owner(String firstname, String lastName) {
		this.firstname = firstname;
		this.lastName = lastName;
	}

	public Owner(String firstname, String lastName, List<Car> cars) {
		this.firstname = firstname;
		this.lastName = lastName;
		this.cars = cars;
	}

	public Long getOwnerid() {
		return ownerid;
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
	
	public void setCars(List<Car> cars) {this.cars = cars;}
}
