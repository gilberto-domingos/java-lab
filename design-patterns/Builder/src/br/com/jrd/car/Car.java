package br.com.jrd.car;

import br.com.jrd.component.CarType;
import br.com.jrd.component.Engine;
import br.com.jrd.component.Transmission;

public class Car {
	private final CarType carType;
	private final int seats;
	private final Transmission transmission;
	private final Engine engine;
	

	public Car(CarType carType, int seats, Engine engine, Transmission transmission) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
	}

	public CarType getCarType() {
		return carType;
	}

	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

}
