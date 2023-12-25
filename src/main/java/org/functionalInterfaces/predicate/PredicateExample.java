package org.functionalInterfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 3, 8, 15, 9, 20);

        // Using a Predicate to filter numbers greater than 10
        Predicate<Integer> greaterThanTen = num -> num > 10;

        System.out.println("Numbers greater than 10:");
        for (Integer num : numbers) {
            if (greaterThanTen.test(num)) {
                System.out.println(num);
            }
        }
    }
}

