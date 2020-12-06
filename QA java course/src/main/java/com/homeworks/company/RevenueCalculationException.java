package com.homeworks.company;

public class RevenueCalculationException extends Exception{

    public RevenueCalculationException(String message) {
        super(message);
    }

    public RevenueCalculationException(String message, Throwable cause) {
        super(message, cause);
    }
}
