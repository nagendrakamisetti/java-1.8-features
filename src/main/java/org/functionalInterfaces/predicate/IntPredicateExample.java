package org.functionalInterfaces.predicate;

import java.util.function.IntPredicate;

public class IntPredicateExample {
    public static void main(String[] args) {
        IntPredicate isPositive = num -> num > 0;
        System.out.println(isPositive.test(5)); // Output: true
    }
}

