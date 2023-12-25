package org.functionalInterfaces.supplier;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveSuppliersExample {
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier = () -> new Random().nextBoolean();
        DoubleSupplier doubleSupplier = () -> new Random().nextDouble();
        LongSupplier longSupplier = () -> new Random().nextLong();
        IntSupplier intSupplier = () -> new Random().nextInt();

        System.out.println("Random Boolean: " + booleanSupplier.getAsBoolean());
        System.out.println("Random Double: " + doubleSupplier.getAsDouble());
        System.out.println("Random Long: " + longSupplier.getAsLong());
        System.out.println("Random Int: " + intSupplier.getAsInt());
    }
}

