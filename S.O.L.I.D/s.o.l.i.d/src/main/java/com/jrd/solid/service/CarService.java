package com.jrd.solid.service;

import java.util.List;

import com.jrd.solid.entity.Car;

public interface CarService {
	public Car createCar(Car car);
	public List<Car> findAll();
	
}
