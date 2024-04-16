package org.example.operator;

public class Root implements Operator{
    @Override
    public double execute(int a, int b) {
        return Math.pow(a, 1/b);
    }
}
