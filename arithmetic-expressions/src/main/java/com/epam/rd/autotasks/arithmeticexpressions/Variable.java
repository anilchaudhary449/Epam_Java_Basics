package com.epam.rd.autotasks.arithmeticexpressions;

public class Variable implements Expression {
    public String name;
    public int value;

    public Variable(String name, int value) {
        this.value = value;
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toExpressionString() {
        return name;
    }
}