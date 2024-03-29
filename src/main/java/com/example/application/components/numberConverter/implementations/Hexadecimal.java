package com.example.application.components.numberConverter.implementations;

import com.example.application.components.numberConverter.NumberConverterBaseClass;
import org.springframework.stereotype.Component;

@Component
public class Hexadecimal extends NumberConverterBaseClass {
    @Override
    public Long to_decimal(String value) {
        long result =0;
        for(int pos = 0; pos < value.length(); pos++){
            result *= 16;
            int to_sum = value.charAt(pos) - 'A' < 0 ? value.charAt(pos) - '0' : value.charAt(pos) - 'A' + 10;
            result += to_sum;
        }
        return result;
    }
    @Override
    public String from_decimal(Long value) {
        StringBuilder builder = new StringBuilder();
        while(value > 0){
            long next = value % 16;
            if(next < 10){
                builder.append(next);
            } else {
                char nextChar = (char)(next - 10 + 'A');
                builder.append(nextChar);
            }
            value /= 16;
        }
        builder.reverse();
        return builder.toString();
    }
}
