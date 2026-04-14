package com.jrd.solid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.solid.entity.Car;
import com.jrd.solid.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	private CarService carService;

	public CarController(CarService carService) {
		this.carService = carService;
	}
	
	@PostMapping
	public ResponseEntity<Car>save(Car car) {
		Car obj =  this.carService.createCar(car);
		
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Car>>  findAll(){
		List<Car>car = this.carService.findAll();
		
		return ResponseEntity.ok(car);
	}
	
	

}
