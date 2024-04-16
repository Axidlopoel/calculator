package org.example.calculator;
import org.example.operator.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator implements Validator {
    protected Map<String, Operator> operatorMap = new HashMap<>();
    public Calculator() {
        operatorMap.put("+", new Addition());
        operatorMap.put("-", new Subtraction());
        operatorMap.put("/", new Division());
        operatorMap.put("*", new Multiplication());

    }

    public ValidationResult validate(CalculatorInput input) {
        if (!operatorMap.containsKey(input.getOperator())) {
            if (input.getOperator().equals("$") || input.getOperator().equals("#")) {
               return ValidationResult.INVALID_TYPE;
            }
            return ValidationResult.INVALID_INPUT;
        }
        return ValidationResult.OK;
    }



    public double calculate(CalculatorInput input) {
       return operatorMap.get(input.getOperator()).execute(input.getA(), input.getB());
    }

}
