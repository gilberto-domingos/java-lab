package br.com.jrd.factory;

import br.com.jrd.aircraft.Helicopter;
import br.com.jrd.aircraft.IAircraft;
import br.com.jrd.landVehicle.ILandVehicle;
import br.com.jrd.landVehicle.Motorcycle;

public class NineNineTransport implements ITransportFactory {

	@Override
	public ILandVehicle createTrasnportVehicle() {
		return new Motorcycle();
	}

	@Override
	public IAircraft createTransportAircraft() {
		return new Helicopter();
	}

}
