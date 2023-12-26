package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Collecting elements into a list
        List<String> collectedList = words.stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Filtered words collected into a list: " + collectedList);

        // Counting elements in the stream
        long count = words.stream()
                .filter(word -> word.length() > 5)
                .count();

        System.out.println("Count of words with length > 5: " + count);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Reducing to a single value (sum of numbers)
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers: " + sum);

        // forEach: Applying an action to each element
        System.out.println("Printing each element:");
        words.stream()
                .forEach(System.out::println);

        // findFirst: Finding the first element that matches the condition
        Optional<String> firstMatch = words.stream()
                .filter(word -> word.startsWith("o"))
                .findFirst();

        System.out.println("First word starting with 'o': " + firstMatch.orElse("Not found"));

        // findAny: Finding any element that matches the condition. will be useful in case of parallel streams
        Optional<String> anyMatch = words.stream()
                .filter(word -> word.length() > 5)
                .findAny();

        System.out.println("Any word with length > 5: " + anyMatch.orElse("Not found"));
    }
}

