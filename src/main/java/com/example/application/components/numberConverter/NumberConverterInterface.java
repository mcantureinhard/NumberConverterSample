package com.example.application.components.numberConverter;

public abstract interface NumberConverterInterface {
    public Integer to_decimal(String value);
    public String from_decimal(Integer value);
}