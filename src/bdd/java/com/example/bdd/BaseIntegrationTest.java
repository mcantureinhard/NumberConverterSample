package com.example.bdd;

import com.example.NumberConverter;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration
@SpringBootTest(classes = {NumberConverter.class})
public abstract class BaseIntegrationTest {
}