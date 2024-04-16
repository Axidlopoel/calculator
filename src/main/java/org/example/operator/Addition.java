package org.example.operator;

public class Addition implements Operator{
    @Override
    public double execute(int a, int b) {
        return a+b;
    }
}
