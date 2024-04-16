package org.example.exception;

public class NoSuchCalculatorTypeException extends RuntimeException{
    public NoSuchCalculatorTypeException() {
        super("Invalid parameter(s) was(/were) given. Exiting calculator program.");
    }
}
