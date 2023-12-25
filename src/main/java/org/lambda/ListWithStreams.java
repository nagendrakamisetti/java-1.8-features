package org.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListWithStreams {

    public static void main(String... args) {
        List<String> list = Arrays.asList("a", "b", "c");
        for (String val : list) {
            System.out.println("Value " + val);
        }

        list.forEach(val -> {
            System.out.println(val);
        });

        list.stream()
        .filter(str -> str.equals("abc"))
                .collect(Collectors.toList());
    }
}
