package com.jrd.solid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jrd.solid.entity.Car;
import com.jrd.solid.entity.Motorcycle;
import com.jrd.solid.entity.VehicleType;

@SpringBootApplication
public class Application {

	private static VehicleType vehicleType;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	/*	vehicleType = VehicleType.CAR;

		if (vehicleType == VehicleType.CAR) {
			Car car = new Car("Amarelo", "2021", 2.0, 4);

		} else if (vehicleType == VehicleType.MOTORCYCLE) {
			Motorcycle motorcycle = new Motorcycle("Verde", "2021", 250);

		} */

	}

}
