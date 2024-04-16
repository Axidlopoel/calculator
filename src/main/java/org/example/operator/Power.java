package org.example.operator;

public class Power implements Operator{
    @Override
    public double execute(int a, int b) {
        return Math.pow(a, b);
    }
}
