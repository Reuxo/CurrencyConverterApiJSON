package com.example.currencyconverterapi.service;

import com.example.currencyconverterapi.logic.Converter;
import com.example.currencyconverterapi.logic.IConverter;


public class ConverterService implements IConverter {


    @Override
    public JsonMessage.OutputMessage solve(JsonMessage.InputMessage input) {
        System.out.println(input.curToBuy + " " + input.curToSell + " " + input.amount);
        String curs = input.curToBuy + "-" + input.curToSell;
        return new JsonMessage.OutputMessage(
                new Converter(input.curToBuy, input.curToSell, input.amount).currencyConverter());
    }


}
