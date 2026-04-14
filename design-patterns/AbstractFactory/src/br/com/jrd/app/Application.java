package br.com.jrd.app;

import br.com.jrd.aircraft.IAircraft;
import br.com.jrd.factory.ITransportFactory;
import br.com.jrd.landVehicle.ILandVehicle;

public class Application {
	private ILandVehicle vehicle;
	private IAircraft aircraft;

	public Application(ITransportFactory factory) {
      vehicle = factory.createTrasnportVehicle();
      aircraft = factory.createTransportAircraft();
	}
	
	public void startRoute() {
		vehicle.startRoute();
		aircraft.startRoute();
	}

}