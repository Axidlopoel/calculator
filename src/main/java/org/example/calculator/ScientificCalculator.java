package org.example.calculator;

import org.example.exception.InvalidCalculatorTypeException;
import org.example.operator.Power;
import org.example.operator.Root;

import java.util.Map;

public class ScientificCalculator extends Calculator {

    public ScientificCalculator() {
        super();
        operatorMap.put("$", new Power());
        operatorMap.put("#", new Root());
    }

    @Override
    public ValidationResult validate(CalculatorInput input) {
        if (!operatorMap.containsKey(input.getOperator())) {
            return ValidationResult.INVALID_INPUT;
        }
        return ValidationResult.OK;
    }
    }
}
