package com.apiibge.controller;

import com.apiibge.model.City;
import com.apiibge.repository.CityRepository;
import com.apiibge.util.CSVUtil;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.map.LinkedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import static ch.lambdaj.Lambda.*;


@RestController("/city")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    MongoTemplate template;

    int lessCount;

    int greaterCount;

    @Autowired
    CSVUtil csvUtil;

    private static Integer apply(Integer e1, Integer e2) {
        return e1;
    }


    @GetMapping("/capitals")
    @Transactional
    public List<City> findCapitals() {
       Query query = Query.query(Criteria.where("capital").is("true"));
       return template.find(query, City.class);
    }

    @GetMapping("/more-less-cities")
    public ResponseEntity<?> largestSmallestCities() {

        LinkedMap<String, Integer> sortedMap =
                findCitiesPerState().entrySet().stream().
                        sorted(Map.Entry.comparingByValue()).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                CityController::apply, LinkedMap::new));

        Map<String, Integer> cities = new HashMap<>();
        cities.put(sortedMap.firstKey(), sortedMap.getValue(0));
        cities.put(sortedMap.lastKey(), sortedMap.getValue(sortedMap.keySet().size() - 1));

        return new ResponseEntity<>(cities, HttpStatus.OK);

    }


    @GetMapping("/cities-per-state")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Integer> findCitiesPerState(){
        List<City> cities = cityRepository.findAll();
        Map<String, Integer> count = new HashMap<>();

        cities.iterator().forEachRemaining(new Consumer<City>() {
            @Override
            public void accept(City city) {
                String uf = city.getUf();

                    if (count.containsKey(city.getUf())){
                        count.replace(city.getUf(), count.get(city.getUf())+ 1  );
                    }else{
                        count.put(city.getUf(),1 );
                    }


            }
        });
        return count;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<City> findById(@PathVariable("id") String id) {
        Optional<City> optionalCity = cityRepository.findById(id);
        if (optionalCity.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else{
            return new ResponseEntity<>(optionalCity.get(), HttpStatus.OK);
        }
    }

    @GetMapping("/uf/{uf}")
    public ResponseEntity<List<City>> findByUf(@PathVariable String uf){
        return new ResponseEntity<>(cityRepository.findByUf(uf), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveCity(@RequestBody City city){
        City byName = cityRepository.findByNameAndUf(city.getName(), city.getUf());
        if(byName != null){
            return new ResponseEntity<String>("A cidade de nome " + city.getName() + "já existe neste estado!", HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<City>(cityRepository.save(city), HttpStatus.OK);
        }
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteById(@PathVariable String id){
        cityRepository.deleteById(id);
        return new ResponseEntity<>("Sucesso", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteById(@RequestBody City city){
        cityRepository.delete(city);
        return new ResponseEntity<>("sucesso", HttpStatus.OK);
    }

    @GetMapping("find/{column}/{data}")
    public ResponseEntity<?> findByEspecificColumn(@PathVariable String column, @PathVariable String data){
        data = data.replace("-", " ");
        File file = new File("C:/Users/junio/Desktop/Cidades.csv");

        List<City> cities = csvUtil.loadCityList(file);

        Query query = Query.query(Criteria.where(column).is(data));

        return new ResponseEntity<>(template.find(query, City.class),HttpStatus.OK);


    }

    @GetMapping("/count")
    public ResponseEntity<Long> count(){
        return new ResponseEntity<>(cityRepository.count(), HttpStatus.OK);
    }



    public static <V, K> Map<V, K> invert(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey));
    }



    {
    }

    


}
