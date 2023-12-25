package org.functionalInterfaces.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Function<String, Integer> stringLengthFunction = str -> str.length();

        System.out.println("Length of names:");
        for (String name : names) {
            System.out.println(name + ": " + stringLengthFunction.apply(name));
        }
    }
}

