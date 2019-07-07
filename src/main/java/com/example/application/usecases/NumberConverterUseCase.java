package com.example.application.usecases;

import com.example.application.components.numberConverter.NumberConverterBaseClass;
import com.example.application.services.AvailableConvertersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberConverterUseCase {
    @Autowired
    AvailableConvertersService availableConvertersService;

    public String run(String input, String from, String to){
        NumberConverterBaseClass converterFrom = availableConvertersService.getConverterByName(from);
        NumberConverterBaseClass converterTo = availableConvertersService.getConverterByName(to);
        Integer interim = converterFrom.to_decimal(input);
        String result = converterTo.from_decimal(interim);
        return result;
    }
}
