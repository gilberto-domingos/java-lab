package com.jrd.unitarytest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.jrd.unitarytest.controllers.PersonController;
import com.jrd.unitarytest.models.Person;
import com.jrd.unitarytest.services.PersonService;


@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = PersonController.class)
public class PersonTest {
    @Autowired
    private MockMvc mock;
    
    @MockBean
    private PersonService personService;
    
    @Test
    public void createNewPerson() throws Exception {
    	Person mockPerson  = new Person((long) 1, "junior domingos", 24);
    	
    	when(personService.create(any(Person.class))).thenReturn(mockPerson);
    	
    	ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    	String mockPersonJSON = ow.writeValueAsString(mockPerson);
    	
    	this.mock.perform(post("/people")
    			 .contentType(MediaType.APPLICATION_JSON_VALUE)
    			 .accept(MediaType.APPLICATION_JSON_VALUE)
    			 .content(mockPersonJSON))
    	         .andExpect(status().isOk())
    	         .andExpect(content().json(mockPersonJSON));
    	
    	     verify(personService).create(any(Person.class));
    }
    
    
    @Test
    public void findAll() throws Exception {
    	Person junior = new Person((long)1,"junior domingos",24);
    	List<Person>mockPeople = Arrays.asList(junior);
    	
    	ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    	String mockPeopleJSON = ow.writeValueAsString(mockPeople);
    	
    	when(personService.findAll()).thenReturn(mockPeople);
    	mock.perform(get("/people")
    			     .contentType(MediaType.APPLICATION_JSON_VALUE))
    	  .andExpect(status().is(200))
    	  .andExpect(content().json(mockPeopleJSON)); 
    }
    
    @Test
    public void removePerson() throws Exception {
    	mock.perform(delete("/people" + "/{id}", new Long(1)))
    	    .andExpect(status().is(200));
    }
    
    @Test
    public void createNewPersonAndFail() throws Exception {
    	Person mockPerson = new Person((long) 9, "", 18);
    	
    	when(personService.create(any(Person.class))).thenReturn(mockPerson);
    	
    	ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    	String json = ow.writeValueAsString(mockPerson);
    	
    	this.mock.perform(post("/people")
   			 .contentType(MediaType.APPLICATION_JSON_VALUE)
   			 .accept(MediaType.APPLICATION_JSON_VALUE)
   			 .content(json))
   	         .andExpect(status().is(400));
    }
    
    
    
}















