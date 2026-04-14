package com.jrd.solid.service;

import com.jrd.solid.entity.VehicleType;

public class VehicleMainPSI {

	private static VehicleType vehicleType;
	
	public static void main(String[] args) {
			vehicleType = VehicleType.MOTORCYCLE;

		if (vehicleType == VehicleType.CAR) {
			CarPSIimpl car = new CarPSIimpl("Amarelo", "2021", 2.0, 4);

		} else if (vehicleType == VehicleType.MOTORCYCLE) {
			MotocyclePSIimpl motorcycle = new MotocyclePSIimpl("Preta", "1974", 250.0);

		} 

	}

}
