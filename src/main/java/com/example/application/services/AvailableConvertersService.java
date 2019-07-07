package com.example.application.services;

import com.example.application.components.numberConverter.NumberConverterBaseClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class AvailableConvertersService {
    @Autowired
    List<NumberConverterBaseClass> converters;
    List<String> convertersNames;

    @PostConstruct
    public void init() {
        convertersNames = new ArrayList<>(converters.size());
        for(int i = 0; i < converters.size();i++){
            NumberConverterBaseClass converter = converters.get(i);
            String converterName = converter.getClass().getSimpleName();
            convertersNames.add(converterName);
        }
    }

    public List<String> getConvertersNames(){
        return convertersNames;
    }
}
