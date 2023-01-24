package com.example.currencyconverterapi;

import com.example.currencyconverterapi.logic.Converter;
import com.example.currencyconverterapi.logic.IConverter;
import com.example.currencyconverterapi.service.ConverterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    IConverter converter() {
        return new ConverterService();
    }
}
