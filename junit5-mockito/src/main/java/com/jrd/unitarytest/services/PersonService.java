package com.jrd.unitarytest.services;

import java.util.List;

import com.jrd.unitarytest.models.Person;


public interface PersonService {
   
	 public Person create(Person person);
	 
	 public List<Person> findAll();
	 
	 public void remove(Long id);
}
