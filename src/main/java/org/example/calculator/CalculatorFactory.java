package org.example.calculator;

public class CalculatorFactory {
    public static Calculator getCalculator(CalculatorType type) {
        switch (type) {
            case CALCULATOR -> {
                return new Calculator();
            }
            case SCIENTIFIC -> {
                return new ScientificCalculator();
            }
            default -> throw new RuntimeException("Unexpected error");
        }
    }
}
