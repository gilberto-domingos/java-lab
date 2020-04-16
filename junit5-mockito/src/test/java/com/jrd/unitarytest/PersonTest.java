package com.jrd.unitarytest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

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
    	Person mockPerson  = new Person((long) 10, "leandro", 22);
    	
    	when(personService.create(any(Person.class))).thenReturn(mockPerson);
    	
    	ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    	String mockPersonJSON = ow.writeValueAsString(mockPerson);
    	
    	this.mock.perform(post("/person")
    			 .contentType(MediaType.APPLICATION_JSON_VALUE)
    			 .accept(MediaType.APPLICATION_JSON_VALUE)
    			 .content(mockPersonJSON))
    	         .andExpect(status().isOk())
    	         .andExpect(content().json(mockPersonJSON));
    	
    	
    	
    }
    
    
}
