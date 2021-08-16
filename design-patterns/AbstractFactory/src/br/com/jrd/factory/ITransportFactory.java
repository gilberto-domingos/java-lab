package br.com.jrd.factory;

import br.com.jrd.aircraft.IAircraft;
import br.com.jrd.landVehicle.ILandVehicle;

public interface ITransportFactory {
	ILandVehicle createTrasnportVehicle();
	IAircraft createTransportAircraft();
}
