package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class NumberConverter {
    private static ApplicationContext applicationContext;
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(NumberConverter.class);
        applicationContext = springApplication.run(args);
    }
}
