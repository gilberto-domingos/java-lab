package br.com.jrd;

import br.com.jrd.builder.CarBuilder;
import br.com.jrd.builder.TruckBuilder;
import br.com.jrd.car.Car;
import br.com.jrd.car.Truck;
import br.com.jrd.director.Director;

public class Main {

	public static void main(String[] args) {
		
		Director director = new Director();
		
		// criando o carro
		CarBuilder carBuilder = new CarBuilder();
		director.constructSedanCar(carBuilder);
		
		Car car = carBuilder.getResult();
		System.out.println("Carro produzido com sucesso ! : " + car.getCarType());
		
	//-------------------------------------------------//	
		
		// criando ao caminhão 
		TruckBuilder truckBuilder = new TruckBuilder();
		director.constructTruck(truckBuilder);
		
		Truck truck = truckBuilder.getResult();
		System.out.println("Caminhão produzido com sucesso ! : " + truck.result());

	}

}
