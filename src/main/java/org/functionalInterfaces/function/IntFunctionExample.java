package org.functionalInterfaces.function;

import java.util.function.IntFunction;

public class IntFunctionExample {
    public static void main(String[] args) {
        IntFunction<Integer> square = num -> num * num;

        int number = 5;
        int squaredNumber = square.apply(number);

        System.out.println("Square of " + number + " is " + squaredNumber);
    }
}

