package com.example.application.services;

import com.example.application.components.numberConverter.NumberConverterBaseClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class AvailableConvertersService {
    @Autowired
    List<NumberConverterBaseClass> converters;
    List<String> convertersNames;
    HashMap<String, NumberConverterBaseClass> convertersMap;

    @PostConstruct
    public void init() {
        convertersNames = new ArrayList<>(converters.size());
        convertersMap = new HashMap<>();
        for(NumberConverterBaseClass converter: converters){
            String converterName = converter.getClass().getSimpleName();
            convertersNames.add(converterName);
            convertersMap.put(converterName, converter);
        }
    }

    public List<String> getConvertersNames(){
        return convertersNames;
    }

    public NumberConverterBaseClass getConverterByName(String name){
        return convertersMap.get(name);
    }
}
