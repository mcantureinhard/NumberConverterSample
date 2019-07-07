package com.example.application.components.numberConverter.implementations;

import com.example.application.components.numberConverter.NumberConverterBaseClass;
import org.springframework.stereotype.Component;

@Component
public class Decimal extends NumberConverterBaseClass {
    @Override
    public Integer to_decimal(String value) {
        return Integer.parseInt(value);
    }

    @Override
    public String from_decimal(Integer value) {
        return Integer.toString(value);
    }
}
