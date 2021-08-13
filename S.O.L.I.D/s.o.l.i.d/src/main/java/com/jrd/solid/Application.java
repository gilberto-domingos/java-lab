package com.jrd.solid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jrd.solid.entity.Vehicle;
import com.jrd.solid.entity.VehicleType;

@SpringBootApplication
public class Application {

	private static VehicleType vehicleType;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		vehicleType = VehicleType.CAR;

		if (vehicleType == VehicleType.CAR) {
			Vehicle vehicle = new Vehicle("Amarelo", "2021", 2.0, 4);
			vehicle.car();
		}else if(vehicleType == VehicleType.MOTORCYCLE) {
			Vehicle vehicle = new Vehicle("Verde", "2021", 250, 1);
			vehicle.motorcycle();
		}

	}

}
