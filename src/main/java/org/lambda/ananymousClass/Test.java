package org.lambda.ananymousClass;

public class Test {
    public static void main(String... args) {
        Calculator addCalculator = new AddCalculator();
        int result = addCalculator.calculate(3, 2);
        System.out.println("Add " + result);

        Calculator subCalculator = new SubstractCalculator();
        result = subCalculator.calculate(3, 2);
        System.out.println("Subtract " + result);
        Calculator addCalculator2 = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        result = addCalculator2.calculate(3, 2);
        System.out.println("Add-2 " + result);

        Calculator subCalculator2 = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };
        result = subCalculator2.calculate(3, 2);
        System.out.println("Subtract-2 " + result);

    }
}
