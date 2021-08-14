package com.jrd.solid.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Motorcycle extends Vehicle {

	public Motorcycle() { };

	public Motorcycle(String color, String year, double engine) {
		this.color = color;
		this.year = year;
		this.engine = engine;

		configureMotorcycle();
	}
	

	public void configureMotorcycle() {
		System.out.println("Criando uma moto : " + year + " " + engine + " cilindradas ");

		startVehicle();
	}

}
