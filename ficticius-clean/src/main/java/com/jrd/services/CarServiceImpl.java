package com.jrd.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.models.Car;
import com.jrd.models.projection.CarConsumption;
import com.jrd.repositories.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	
	private CarRepository carRepository;
	
	@Autowired
	public CarServiceImpl(CarRepository carRepository) {
		this.carRepository = carRepository;
	}
	

	@Override
	public List<Car> findAll() {
		return this.carRepository.findAll();
	}

	@Override
	public Car find(Long id) {
		 return this.carRepository.findById(id).get();
	}

	@Override
	public Car create(Car car) {
		this.carRepository.save(car);
		return car;
	}

	@Override
	public Car update(Long id, Car car) {
		Car carExists = this.carRepository.findById(id).get();
		
		if (carExists != null) {
			car.setId(carExists.getId());
			this.carRepository.save(car);
			return car;
		}
		
		return null;
		
	}

	@Override
	public void delete(Long id) {
	  Car car = this.carRepository.findById(id).get();
	  
	  if (car != null) this.carRepository.delete(car);
	  
	}


	@Override
	public List<CarConsumption> findAllRankedByConsumption(double totalKmCidade, double totalKmRodovia,
			double preco) {
		
		List<Car> cars = this.findAll(); 
	return cars
			.stream()
			.map(car -> new CarConsumption(car,totalKmCidade,totalKmRodovia, preco))
			.sorted((car1, car2) -> Double.compare(car1.getValorTotalGastoComCombustivel(), car2.getValorTotalGastoComCombustivel()))
			.collect(Collectors.toList());
		
	}
	
	  
	

}
