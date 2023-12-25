package org.functionalInterfaces.predicate;

import java.util.function.DoublePredicate;

public class DoublePredicateExample {
    public static void main(String[] args) {
        DoublePredicate isLessThanZero = num -> num < 0.0;
        System.out.println(isLessThanZero.test(-5.5)); // Output: true
    }
}
