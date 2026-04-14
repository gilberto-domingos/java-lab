package com.apiibge;

import com.apiibge.model.City;
import com.apiibge.repository.CityRepository;
import com.apiibge.util.CSVUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;


@Component
public class InitializationLoader implements ApplicationListener<ContextRefreshedEvent> {


    @Autowired
    CityRepository repository;

    @Autowired
    private CSVUtil csvUtil;

    Logger logger = LoggerFactory.getLogger(InitializationLoader.class);


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(repository.findAll().equals(Collections.emptyList())) {
            File file = new File("/root/documents/cidades.csv");

            try (FileInputStream fis = new FileInputStream(file)) {

                logger.info("Tamanho total do arquivo: " + fis.available());



            } catch (IOException e) {
                logger.error("Erro ao ler arquivo no caminho " + file.getPath() + " o arquivo existe?");
                e.printStackTrace();
            }

            List<City> cityList = csvUtil.loadCityList(file);

            try {
                logger.info("Persistindo " + cityList.size() + " entidades no banco de dados");

               repository.saveAll(cityList);

            } catch (Exception e) {
                logger.error("Erro ao persistir entidades");
                e.printStackTrace();
            }
        }else{
            logger.info("Cidades já foram carregadas no banco");
        }

    }

}
