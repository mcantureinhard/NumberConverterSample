package com.example.application.components.numberConverter;

public abstract interface NumberConverterInterface {
    public Long to_decimal(String value);
    public String from_decimal(Long value);
}