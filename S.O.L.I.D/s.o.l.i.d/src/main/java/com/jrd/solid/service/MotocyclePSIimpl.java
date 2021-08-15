package com.jrd.solid.service;

public class MotocyclePSIimpl implements IVehiclePSI {
	
	private String color;
	private String year;
	private double engine;	
	
	public MotocyclePSIimpl(String color, String year, double engine) {
		super();
		this.color = color;
		this.year = year;
		this.engine = engine;
		
		configureMotorcycle(color, year, engine);
		
	}

	@Override
	public void configureCar(String color, String year, double engine, int seats) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureMotorcycle(String color, String year, double engine) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		
		System.out.println("Criando uma moto " + color + " " + year + " " + engine);
		startVehicle();
		
		
	}

	@Override
	public void startVehicle() {
		System.out.println("Ligando os motores");
		
	}

}
