package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve", "Frank");

        // Filtering names that start with 'A' and transforming to uppercase
        List<String> filteredAndUpperCaseNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Filtered names starting with 'A' and in uppercase: " + filteredAndUpperCaseNames);

        // Skipping the first two elements and limiting to the next three elements
        List<String> skippedAndLimitedNames = names.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Skipped first two and limited to next three names: " + skippedAndLimitedNames);

        // Sorting the names in natural order
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted names: " + sortedNames);

        // Distinct names from a list that may have duplicates
        List<String> distinctNames = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob", "Eve");
        List<String> uniqueNames = distinctNames.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique names: " + uniqueNames);

        // Map each word to its length
        List<Integer> wordLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("Length of words: " + wordLengths);
    }
}

