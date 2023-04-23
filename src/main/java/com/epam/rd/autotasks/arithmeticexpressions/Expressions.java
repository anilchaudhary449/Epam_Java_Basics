package com.epam.rd.autotasks.arithmeticexpressions;

import java.rmi.server.ExportException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Expressions {

    public static Variable var(String name, int value) {
        Variable variable = new Variable(name, value);
        return variable;
    }

    public static Expression val(int value) {
        Expression expression = new Expression() {
            @Override
            public int evaluate(){
                return value;
            }
            @Override
            public String toExpressionString(){
                if(value < 0) return "(" + value + ")";
                else return "" + value;
            }
        };
        return expression;
    }

    public static Expression sum(Expression... members){
        Expression expression = new Expression() {
            @Override
            public int evaluate(){
                int sum = 0;
                for(int i = 0;i < members.length;i++){
                    sum += members[i].evaluate();
                }
                return sum;
            }
            public String toExpressionString(){
                List<String> listOfMembers = new LinkedList<String>();
                for(int i = 0 ;i<members.length;i++){
                    listOfMembers.add(members[i].toExpressionString());
                }
                String text = listOfMembers.stream().collect(Collectors.joining(" + ","(",")"));
                return text;
            }
        };
        return expression;
    }

    public static Expression product(Expression... members){
        Expression expression = new Expression() {
            @Override
            public int evaluate(){
                int product = 1;
                for(int i = 0;i < members.length;i++){
                    product *= members[i].evaluate();
                }
                return product;
            }
            public String toExpressionString(){
                List<String> listOfMembers = new LinkedList<String>();
                for(int i = 0 ;i<members.length;i++){
                    listOfMembers.add(members[i].toExpressionString());
                }
                String text = listOfMembers.stream().collect(Collectors.joining(" * ","(",")"));
                return text;
            }
        };
        return expression;
    }

    public static Expression difference(Expression minuend, Expression subtrahend){
        Expression expression = new Expression() {
            @Override
            public int evaluate(){
                int difference = minuend.evaluate() - subtrahend.evaluate();
                return difference;
            }
            public String toExpressionString(){
                List<String> listOfMembers = new LinkedList<String>();
                listOfMembers.add(minuend.toExpressionString());
                listOfMembers.add(subtrahend.toExpressionString());
                String text = listOfMembers.stream().collect(Collectors.joining(" - ","(",")"));
                return text;
            }
        };
        return expression;
    }

    public static Expression fraction(Expression dividend, Expression divisor){
        Expression expression = new Expression() {
            @Override
            public int evaluate(){
                int fraction = dividend.evaluate() / divisor.evaluate();
                return fraction;
            }
            public String toExpressionString(){
                List<String> listOfMembers = new LinkedList<String>();
                listOfMembers.add(dividend.toExpressionString());
                listOfMembers.add(divisor.toExpressionString());
                String text = listOfMembers.stream().collect(Collectors.joining(" / ","(",")"));
                return text;
            }
        };
        return expression;
    }

}