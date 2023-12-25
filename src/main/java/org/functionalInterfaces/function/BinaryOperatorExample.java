package org.functionalInterfaces.function;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> maxNumber = Integer::max;

        int number1 = 15;
        int number2 = 25;
        int max = maxNumber.apply(number1, number2);

        System.out.println("Maximum between " + number1 + " and " + number2 + " is " + max);
    }
}
