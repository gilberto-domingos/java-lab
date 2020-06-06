package com.jrd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrd.models.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
