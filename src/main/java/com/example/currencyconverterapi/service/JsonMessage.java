package com.example.currencyconverterapi.service;

import java.util.Date;

public class JsonMessage {

    public interface IMessage {

    }

    public  static class Message implements IMessage {

        public String message;

        public Date time;

        public Message(String message) {
            this.message = message;
            this.time = new Date();
        }

        @Override
        public String toString() {
            return "Message{" +
                    "message='" + message + '\'' +
                    ", time=" + time +
                    '}';
        }

    }

    public static class InputMessage implements IMessage {

        public String curToBuy;
        public String curToSell;
        public  double amount;

        public InputMessage(String curToBuy, String curToSell, double amount) {
            this.curToBuy = curToBuy;
            this.curToSell = curToSell;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "InputMessage{" +
                    "curToBuy=" + curToBuy +
                    ", curToSell=" + curToSell +
                    ", amount=" + amount +
                    '}';
        }
    }

    public static class OutputMessage implements IMessage {
        public double summa;
        public  OutputMessage(double summa) {
            this.summa = summa;
        }
    }

    public static class ErrorMessage extends Message {

        public ErrorMessage(String message) {
            super(message);
        }

    }
}
