package br.com.jrd;

import br.com.jrd.vehicles.IVehicle;

public abstract class Transport {

	public void startTransport() {
		IVehicle vehicle = createTransport();
		vehicle.startRoute();
	}    
	
	protected abstract IVehicle createTransport();
}
