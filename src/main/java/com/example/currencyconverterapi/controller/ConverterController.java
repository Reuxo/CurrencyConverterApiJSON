package com.example.currencyconverterapi.controller;

import com.example.currencyconverterapi.logic.IConverter;
import com.example.currencyconverterapi.service.JsonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/currency")
public class ConverterController {

    @Autowired
    private IConverter converter;

    @GetMapping("/convert")
    public JsonMessage.OutputMessage convert(@RequestBody JsonMessage.InputMessage input) {
        return converter.solve(input);
    }

}
