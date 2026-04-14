package br.com.jrd.car;

import br.com.jrd.component.CarType;
import br.com.jrd.component.Engine;
import br.com.jrd.component.Transmission;

public class Truck {
	private final CarType carType;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	
	
	public Truck(CarType carType, int seats, Engine engine, Transmission transmission) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
	}	
	

	public String result() {
		String truck = "Truck whith motor : " + engine.getPower() + "\n";
		truck += " Transmission : " + transmission;
		
		return truck;
	}
   
    
   
   
   
}






















