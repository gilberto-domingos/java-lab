package com.jrd.unitarytest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrd.unitarytest.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
