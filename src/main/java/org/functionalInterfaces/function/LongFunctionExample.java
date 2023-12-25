package org.functionalInterfaces.function;

import java.util.function.LongFunction;

public class LongFunctionExample {
    public static void main(String[] args) {
        LongFunction<Double> millisecondsToSeconds = millis -> millis / 1000.0;

        long milliseconds = 5000L;
        double seconds = millisecondsToSeconds.apply(milliseconds);

        System.out.println(milliseconds + " milliseconds is equal to " + seconds + " seconds");
    }
}

