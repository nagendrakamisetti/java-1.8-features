package org.functionalInterfaces.function;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> calculateArea = (length, width) -> length * width;

        int length = 5;
        int width = 10;
        int area = calculateArea.apply(length, width);

        System.out.println("Area of the rectangle with length " + length + " and width " + width + " is " + area);
    }
}
