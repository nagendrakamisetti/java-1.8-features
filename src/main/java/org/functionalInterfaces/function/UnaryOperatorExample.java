package org.functionalInterfaces.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> incrementByFive = num -> num + 5;

        int number = 10;
        int incrementedNumber = incrementByFive.apply(number);

        System.out.println("Incremented number by 5: " + incrementedNumber);
    }
}

