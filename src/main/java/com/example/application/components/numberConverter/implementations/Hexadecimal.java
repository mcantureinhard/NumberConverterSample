package com.example.application.components.numberConverter.implementations;

import com.example.application.components.numberConverter.NumberConverterBaseClass;
import org.springframework.stereotype.Component;

@Component
public class Hexadecimal extends NumberConverterBaseClass {
    @Override
    public Integer to_decimal(String value) {
        return 0;
    }
    @Override
    public String from_decimal(Integer value) {
        return "";
    }
}
