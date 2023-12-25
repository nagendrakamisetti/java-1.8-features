package org.lambda;

interface Calculator {
    int calculate(int a, int b);
}

public class LambdaWithParameters {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        int result = addition.calculate(5, 3);
        System.out.println("Addition: " + result);

        result = subtraction.calculate(5, 3);
        System.out.println("Subtraction: " + result);
    }
}