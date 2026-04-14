package com.jrd.solid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.solid.entity.Car;
import com.jrd.solid.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService  {
	
	@Autowired
	private CarRepository carRepository;	

	public CarServiceImpl(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	@Override
	public Car createCar(Car car) {
		return this.carRepository.save(car);
	}

	@Override
	public List<Car> findAll() {
		return this.carRepository.findAll();
	}

}
