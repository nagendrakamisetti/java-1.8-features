package org.functionalInterfaces.function;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {
    public static void main(String[] args) {
        DoubleFunction<Double> celsiusToFahrenheit = celsius -> celsius * 9 / 5 + 32;

        double celsiusTemperature = 25.0;
        double fahrenheitTemperature = celsiusToFahrenheit.apply(celsiusTemperature);

        System.out.println(celsiusTemperature + "°C is equal to " + fahrenheitTemperature + "°F");
    }
}

