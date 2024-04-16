package org.example.operator;

public class Division implements Operator{
    @Override
    public double execute(int a, int b) {
        return a/b;
    }
}
