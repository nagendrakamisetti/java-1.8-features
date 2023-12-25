package org.functionalInterfaces.predicate;

import java.util.function.LongPredicate;

public class LongPredicateExample {
    public static void main(String[] args) {
        LongPredicate isGreaterThanHundred = num -> num > 100L;
        System.out.println(isGreaterThanHundred.test(150L)); // Output: true
    }
}

