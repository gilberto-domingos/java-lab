package com.jrd.services;

import java.util.List;

import com.jrd.models.Car;
import com.jrd.models.projection.CarConsumption;


public interface CarService  {
	
	 public List<Car> findAll();
	 public Car find(Long id);
	 public Car create(Car car);
	 public Car update(Long id, Car car);
	 public void delete(Long id);
	 public List<CarConsumption> findAllRankedByConsumption(double totalKmCidade, double totalKmRodovia,
			double preco);
	 
}
