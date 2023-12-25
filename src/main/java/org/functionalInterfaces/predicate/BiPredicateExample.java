package org.functionalInterfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 15);
        int targetSum = 15;

        BiPredicate<Integer, Integer> sumGreaterThan = (num1, num2) -> (num1 + num2) > targetSum;

        System.out.println("Pairs with sum greater than " + targetSum + ":");
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (sumGreaterThan.test(numbers.get(i), numbers.get(j))) {
                    System.out.println("(" + numbers.get(i) + ", " + numbers.get(j) + ")");
                }
            }
        }
    }
}

