package com.example.application.usecases;

import com.example.application.services.AvailableConvertersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvailableConversionsUseCase {
    @Autowired
    AvailableConvertersService availableConvertersService;
    public List<String> run() {
        return availableConvertersService.getConvertersNames();
    }
}
