package org.methodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExample {

    // Static method for method reference example
    static String convertToString(Integer number) {
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        // Reference to a static method
        Function<Integer, String> converter = MethodReferenceExample::convertToString;
        String result = converter.apply(10);
        System.out.println("Static Method Reference Result: " + result);

        // Reference to an instance method of a particular object
        String str = "Hello";
        Supplier<Integer> supplier = str::length;
        int length = supplier.get();
        System.out.println("Instance Method Reference Result: " + length);

        // Reference to an instance method of an arbitrary object of a particular type
        List<String> strings = Arrays.asList("one", "two", "three");
        strings.forEach(System.out::println);

        // Reference to a constructor. (This one can be used in stream.map)
        Supplier<List<String>> listSupplier = Arrays::asList;
        List<String> newList = listSupplier.get();
        System.out.println("Constructor Reference Result: " + newList);
    }
}
