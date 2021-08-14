package com.jrd.solid.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Vehicle {
	
	protected String color;
	protected String year;
	protected double engine;
	
	
	public void startVehicle() {
		System.out.println("Ligando os motores");
	}
}
