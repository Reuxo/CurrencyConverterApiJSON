package com.example.currencyconverterapi.logic;

import com.example.currencyconverterapi.service.JsonMessage;
import org.springframework.stereotype.Component;

@Component
public interface IConverter {

   JsonMessage.OutputMessage solve(JsonMessage.InputMessage input);


}
