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
        int intValue = value.intValue();
        StringBuilder builder = new StringBuilder();
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        builder.append(M[intValue/1000]);
        builder.append(C[(intValue/100) % 10]);
        builder.append(X[(intValue/10) % 10]);
        builder.append(I[(intValue) % 10]);
        System.out.println("ROOOOOMAAAAAN " + builder.toString());
        return builder.toString();
    }
}
