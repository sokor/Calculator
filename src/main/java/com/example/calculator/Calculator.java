package com.example.calculator;

public class Calculator {
    public int doTheAddition (int a, int b) {
        return a + b;
    }
    public int doTheSubstruction (int a, int b){
        return a - b;
    }
    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        int result = calculator.doTheAddition(8, 7);
        System.out.println(result);
    }
}


