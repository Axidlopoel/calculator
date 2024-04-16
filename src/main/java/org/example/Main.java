package org.example;

import org.example.calculator.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = CalculatorFactory.getCalculator(UserInteractionHandler.getCalculatorType());

        CalculatorInput input = UserInteractionHandler.getInput();

        UserInteractionHandler.handleValidationResult(calculator.validate(input));

        UserInteractionHandler.printResult(calculator.calculate(input));
    }
}