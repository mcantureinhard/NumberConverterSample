package com.example.application.components.numberConverter.implementations;

import com.example.application.components.numberConverter.NumberConverterBaseClass;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

@Component
public class Roman extends NumberConverterBaseClass {

    @Override
    public Long to_decimal(String value) {
        if(value.length() == 0){
            return (long)0;
        }
        Map<Character, Integer> valMap = new HashMap<Character, Integer>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < value.length(); i++){
            char current = value.charAt(i);
            int numeric = valMap.get(current);
            if(st.empty()){
                st.push(numeric);
            } else {
                int sub = 0;
                while(!st.empty() && numeric > st.peek()){
                    sub += st.pop();
                }
                st.push(numeric - sub);
            }
        }
        int res = 0;
        while(!st.empty()){
            res += st.pop();
        }
        return (long)res;
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
