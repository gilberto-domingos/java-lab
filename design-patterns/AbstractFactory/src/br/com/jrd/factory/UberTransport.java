package br.com.jrd.factory;

import br.com.jrd.aircraft.Airplane;
import br.com.jrd.aircraft.IAircraft;
import br.com.jrd.landVehicle.Car;
import br.com.jrd.landVehicle.ILandVehicle;

public class UberTransport implements  ITransportFactory{

	@Override
	public ILandVehicle createTrasnportVehicle() {
		return new Car();
	}

	@Override
	public IAircraft createTransportAircraft() {
		return new Airplane();
	}

}
