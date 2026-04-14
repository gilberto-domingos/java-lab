package com.jrd.solid.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_motorcycle")
public class Motorcycle  {	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;	
	
	@OneToMany(mappedBy = "id")
	private List<Vehicle> vehicle;
	
	public Motorcycle() { }

	public Motorcycle(List<Vehicle> vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	


}
