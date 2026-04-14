package com.jrd.solid.service;

public class CarPSIimpl implements IVehiclePSI, CarPSI {
	
	private String color;
	private String year;
	private double engine;
	private int seats;	

	public CarPSIimpl(String color, String year, double engine, int seats) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		this.seats = seats;
		
		configureCar(color,year,engine,seats);
	}

	@Override
	public void configureCar(String color, String year, double engine, int seats) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		this.seats = seats;
		
		System.out.println("Criando um carro " + color + " " + year + " " + engine + " " + seats + " assentos" );
		startVehicle();
	}
	

	@Override
	public void startVehicle() {
		System.out.println("Ligando os motores");
		
	}

}
