package org.example.operator;

public class Multiplication implements Operator{
    @Override
    public double execute(int a, int b) {
        return a*b;
    }
}
