package org.example.calculator;

import java.util.Map;

public interface Validator {
    default ValidationResult validate(CalculatorInput input) {

    }
}
