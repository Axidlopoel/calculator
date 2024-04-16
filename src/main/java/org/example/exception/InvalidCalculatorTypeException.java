package org.example.exception;

public class InvalidCalculatorTypeException extends RuntimeException {
    public InvalidCalculatorTypeException() {
        super("Invalid parameter(s) was(/were) given. Exiting calculator program.");
    }
}
