package com.example.application.components.numberConverter.implementations;

import com.example.application.components.numberConverter.NumberConverterBaseClass;
import org.springframework.stereotype.Component;

@Component
public class Decimal extends NumberConverterBaseClass {
    @Override
    public Long to_decimal(String value) {
        return Long.parseLong(value);
    }

    @Override
    public String from_decimal(Long value) {
        return Long.toString(value);
    }
}
