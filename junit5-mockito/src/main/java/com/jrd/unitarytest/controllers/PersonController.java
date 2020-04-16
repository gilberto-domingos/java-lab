package com.jrd.unitarytest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping
	public Person create(@RequestBody Person person) {
		return this.personService.create(person);
		
	}

}
