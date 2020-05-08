package com.jrd.unitarytest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.unitarytest.models.Person;
import com.jrd.unitarytest.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Person create(Person person) {
		return this.personRepository.save(person);
	}
	
	@Override
	public List<Person> findAll() {
		return this.personRepository.findAll(); 
	}

	@Override
	public void remove(Long id) {
		if(this.personRepository.existsById(id)) {
			  this.personRepository.deleteById(id);
		}
		
	}
	
	
	
   
}
