package com.jrd.unitarytest.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.unitarytest.models.Person;
import com.jrd.unitarytest.services.PersonService;

@RestController
@RequestMapping("/people")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@GetMapping
	public List<Person>findAll(){
		return this.personService.findAll();
	}
	
	@PostMapping
	public Person create(@RequestBody @Valid Person person) {
		return this.personService.create(person);
		
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable("id") Long id) {
		this.personService.remove(id);
		
	}  
	
	

}












