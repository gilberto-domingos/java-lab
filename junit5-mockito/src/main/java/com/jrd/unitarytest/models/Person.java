package com.jrd.unitarytest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "people")
public class Person {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
    private String name;
	
	@Column
    private Integer age;
   
public Person() { }

public Person(Long id, String name, Integer age) {	//criado para teste de id
	this.id = id;
	this.name = name;
	this.age = age;
}

public Person(String name, Integer age) {	
	this.name = name;
	this.age = age;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
   
   
   
}
