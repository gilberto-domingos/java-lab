package com.jrd.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.models.Car;
import com.jrd.models.projection.CarConsumption;
import com.jrd.services.CarService;


@RestController
@RequestMapping("/cars")
public class CarController {
	
	private CarService carService;
	

	@Autowired	
	public CarController(CarService carService) {
		this.carService = carService;		
	} 
		
		
	@GetMapping
	@ResponseBody
	public List<Car> findAll(){
		return this.carService.findAll();
	}
	
	
	
	  @GetMapping(value = "/byconsumption")
	    public ResponseEntity<List<CarConsumption>> getByConsumo(
	            @RequestParam(value = "totalKmCidade") double totalKmCidade,
	            @RequestParam(value = "totalKmRodovia") double totalKmRodovia,
	            @RequestParam(value = "preco") double preco) {

	    
		  List<CarConsumption> list = this.carService.findAllRankedByConsumption(totalKmCidade, totalKmRodovia, preco);
	      return ResponseEntity.ok().body(list);
	  }
	
	// /byconsumption?totalKmCidade=2&totalKmRodovia=3&preco=2
	
	@GetMapping(value = "/{id}")
	@ResponseBody
	public Car find(@PathVariable(value = "id") Long id) {
		return this.carService.find(id);		
	}
	
	@PostMapping
	@ResponseBody
	public Car create(@RequestBody Car car) {
		return this.carService.create(car);
	}
	
	
	@PutMapping(value = "/{id}")
	@ResponseBody
	public Car update(@PathVariable(value = "id") Long id,  @RequestBody Car car) {
		return this.carService.update(id, car);
	}
	
	
	@DeleteMapping(value = "/{id}")	
	public void delete(@PathVariable(value = "id")Long id, HttpServletResponse response) {
		this.carService.delete(id);
		response.setStatus(HttpServletResponse.SC_NO_CONTENT);
	}

	
	
	
	
	
}
