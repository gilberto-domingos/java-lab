package br.com.jrd;

import br.com.jrd.vehicles.Car;
import br.com.jrd.vehicles.IVehicle;

public class CarTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Car();	}

}
