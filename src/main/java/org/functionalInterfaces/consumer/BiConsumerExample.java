package org.functionalInterfaces.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> addToMap = (key, value) -> map.put(key, value);

        addToMap.accept(1, "One");
        addToMap.accept(2, "Two");
        addToMap.accept(3, "Three");

        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

