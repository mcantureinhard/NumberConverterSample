package com.example.application.components.numberConverter.implementations;

import com.example.application.components.numberConverter.NumberConverterBaseClass;
import org.springframework.stereotype.Component;

@Component
public class Roman extends NumberConverterBaseClass {
    @Override
    public Long to_decimal(String value) {
        return (long)0;
    }
    @Override
    public String from_decimal(Long value) {
        return "";
    }
}
