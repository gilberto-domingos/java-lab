package com.apiibge.util;

import com.apiibge.model.City;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Collections;
import java.util.List;

@Component
public class CSVUtil{

    Logger logger = LoggerFactory.getLogger(CSVUtil.class);

    public List<City> loadCityList(File file) {
        try {

            CsvSchema bootstrapSchema = CsvSchema.emptySchema().withHeader();
            CsvMapper mapper = new CsvMapper();
            MappingIterator<City> readValues =
                    mapper.readerFor(City.class).with(bootstrapSchema).readValues(file);
            return readValues.readAll();
        } catch (Exception e) {
            logger.error("Erro ao parsear o arquivo" + file.getName(), e);
            return Collections.emptyList();
        }
    }
}
