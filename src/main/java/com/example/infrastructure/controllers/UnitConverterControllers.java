package com.example.infrastructure.controllers;

import com.example.application.usecases.AvailableConversionsUseCase;
import com.example.application.usecases.NumberConverterUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnitConverterControllers {

    @Autowired
    AvailableConversionsUseCase availableConversionsUseCase;

    @Autowired
    NumberConverterUseCase numberConverterUseCase;

    @GetMapping(value = "/api/conversions", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<String> getAllConversions() {
        try{
            List<String> conversions = availableConversionsUseCase.run();
            return conversions;
        } catch (Exception e){
            //We can log errors here
            throw e;
        }
    }

    @RequestMapping(value = "/api/convert/{from}/{value}/{to}")
    public String convert(@PathVariable("from") String from, @PathVariable("value") String value, @PathVariable("to") String to){
        try {
            String result = numberConverterUseCase.run(value, from, to);
            return result;
        } catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
