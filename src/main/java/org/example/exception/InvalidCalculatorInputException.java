package org.example.exception;

public class InvalidCalculatorInputException extends RuntimeException{
    public InvalidCalculatorInputException() {
        super("Invalid parameter(s) was(/were) given. Exiting calculator program.");
    }

   /* public InvalidCalculatorInputException(String message) {
        super(message);   ---> ez a construktor képes string paramétert kezelni
    } */
}
