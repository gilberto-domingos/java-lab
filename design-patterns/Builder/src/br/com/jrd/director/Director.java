package br.com.jrd.director;

import br.com.jrd.builder.IBuilder;
import br.com.jrd.component.CarType;
import br.com.jrd.component.Engine;
import br.com.jrd.component.Transmission;

public class Director {
	
	public void constructSedanCar(IBuilder builder) {
		builder.setCarType(CarType.SEDAN);
		builder.setSeats(5);
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setEngine(new Engine(1600));
	}
	
	public void constructTruck(IBuilder builder) {
		builder.setCarType(CarType.TRUCK);
		builder.setSeats(5);
		builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
		builder.setEngine(new Engine(13000));
	}

}
