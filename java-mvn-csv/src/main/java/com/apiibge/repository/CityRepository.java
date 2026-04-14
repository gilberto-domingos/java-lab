package com.apiibge.repository;

import com.apiibge.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends MongoRepository<City, String> {


    List<City> findByName(String name);

    List<City> findByUf(String uf);

    City findByNameAndUf(String name, String uf);



}
