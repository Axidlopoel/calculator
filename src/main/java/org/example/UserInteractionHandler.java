package org.example;

import org.example.calculator.CalculatorInput;
import org.example.calculator.CalculatorType;
import org.example.calculator.ValidationResult;
import org.example.exception.InvalidCalculatorInputException;
import org.example.exception.InvalidCalculatorTypeException;
import org.example.exception.NoSuchCalculatorTypeException;

import java.util.Scanner;

public class UserInteractionHandler {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static CalculatorType getCalculatorType() {
        System.out.println("Adja meg milyen kalkulátort szeretne használni. A Calculator szóval egy egyszerűsített, míg a Scientific szóval" +
                "egy tudományos számológépet fog választani");
        System.out.println("Az egyszerű számológép összeadni, kivonni, szorozni és osztani tud.");
        System.out.println("A tudományos számológép ezeken kívül tud hatványozni és gyököt vonni");

        try {
            return CalculatorType.valueOf(SCANNER.next().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new NoSuchCalculatorTypeException();
        }
    }

    public static CalculatorInput getInput() {
        System.out.println("Adja meg milyen számokkal, és milyen művelettel szeretne számolni.");
        System.out.println("Először adja meg a számot, amelyen a műveletet elvégezni szeretné, majd az operátort, majd azt a számot, amellyel szertné a műveletet elvégezni");
        System.out.println("Az operátorok a következők");
        System.out.println("Összeadás: +");
        System.out.println("Kivánás: -");
        System.out.println("Szorzás: *");
        System.out.println("Osztás: /");
        System.out.println("Hatványozás, ahol a második szám a kitevő: $");
        System.out.println("Gyökvonás, ahol a második szám jelzi, hogy hanyadik gyök: #");

        CalculatorInput input = new CalculatorInput();
        input.setA(SCANNER.next());
        input.setOperator(SCANNER.next());
        input.setB(SCANNER.next());
        return input;
    }

    public static void printResult(double result) {
        System.out.printf("Az eredmény: %s", result);
    }

    public static void handleValidationResult(ValidationResult validationResult) {
        switch (validationResult) {
            case INVALID_INPUT -> throw new InvalidCalculatorInputException();
            case INVALID_TYPE -> throw new InvalidCalculatorTypeException();
            case OK ->  {}
            default -> throw new RuntimeException("Unexpected error");
        }

    }
}
