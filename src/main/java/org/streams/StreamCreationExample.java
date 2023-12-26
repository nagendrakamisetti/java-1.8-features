package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreationExample {
    public static void main(String[] args) {
        // 1. From a Collection
        List<String> list = Arrays.asList("apple", "banana", "orange");
        Stream<String> streamFromList = list.stream();

        // 2. From an array
        String[] array = {"cat", "dog", "bird"};
        Stream<String> streamFromArray = Arrays.stream(array);

        // 3. Stream of elements
        Stream<String> streamOfElements = Stream.of("one", "two", "three");

        // 4. Stream.builder
        Stream.Builder<String> builder = Stream.builder();
        builder.add("hello").add("world");
        Stream<String> streamFromBuilder = builder.build();

        // 5. Stream.generate
        Stream<String> generatedStream = Stream.generate(() -> "random").limit(5);

        // 6. Stream.iterate
        Stream<Integer> iteratedStream = Stream.iterate(0, n -> n + 2).limit(5);

        // Printing elements from streams
        System.out.println("Stream from List: " + streamFromList.collect(Collectors.toList()));
        System.out.println("Stream from Array: " + streamFromArray.collect(Collectors.toList()));
        System.out.println("Stream of Elements: " + streamOfElements.collect(Collectors.toList()));
        System.out.println("Stream from Builder: " + streamFromBuilder.collect(Collectors.toList()));
        System.out.println("Generated Stream: " + generatedStream.collect(Collectors.toList()));
        System.out.println("Iterated Stream: " + iteratedStream.collect(Collectors.toList()));
    }
}

