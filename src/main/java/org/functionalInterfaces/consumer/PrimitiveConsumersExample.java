package org.functionalInterfaces.consumer;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveConsumersExample {
    public static void main(String[] args) {
        DoubleConsumer printDouble = value -> System.out.println("Value: " + value);
        IntConsumer printInt = num -> System.out.println("Number: " + num);
        LongConsumer printLong = num -> System.out.println("Long number: " + num);

        printDouble.accept(3.14);
        printInt.accept(10);
        printLong.accept(1000000000L);
    }
}

