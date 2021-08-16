package br.com.jrd;

import br.com.jrd.vehicles.IVehicle;
import br.com.jrd.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Motorcycle();
	}

}
