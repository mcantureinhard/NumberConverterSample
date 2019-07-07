package com.example.application.components.numberConverter.implementations;

import com.example.application.components.numberConverter.NumberConverterBaseClass;
import org.springframework.stereotype.Component;

@Component
public class Binary extends NumberConverterBaseClass {
    @Override
    public Integer to_decimal(String value) {
        int result = 0;
        for(int pos = 0; pos < value.length(); pos++){
            result *= 2; //Shift to the left
            if(value.charAt(pos) == '1'){
                result++;
            }
        }
        return result;
    }
    @Override
    public String from_decimal(Integer value) {
        StringBuilder builder = new StringBuilder();
        while(value > 0){
            if(value % 2 == 0){
                builder.append('0');
            } else {
                builder.append('1');
            }
            value /= 2;
        }
        builder.reverse();
        return builder.toString();
    }
}
