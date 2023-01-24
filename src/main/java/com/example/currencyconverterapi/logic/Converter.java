package com.example.currencyconverterapi.logic;

import java.util.HashMap;
import java.util.Map;

public class Converter {

    String choice;
    double amount;

    final Map<String, Double> curs = new HashMap<>();

    public Converter(String curToBuy, String curToSell, double amount) {
        this.choice = curToBuy + "-" + curToSell;
        this.amount = amount;
        curs.put("USD-RUB", 0.015);
        curs.put("RUB-USD", 1 / 0.015);
        curs.put("RUB-EUR", 0.013);
        curs.put("EUR-RUB", 1 / 0.013);
        curs.put("USD-EUR", 0.92);
        curs.put("EUR-USD", 1 / 0.92);
    }

    public double currencyConverter() {
      return curs.get(choice) * amount;
    }
}
