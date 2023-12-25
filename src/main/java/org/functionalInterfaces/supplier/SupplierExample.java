package org.functionalInterfaces.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> randomString = () -> {
            Random random = new Random();
            return "RandomNumber_" + random.nextInt(100);
        };

        System.out.println("Generated String: " + randomString.get());
    }
}
