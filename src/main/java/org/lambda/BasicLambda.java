package org.lambda;

@FunctionalInterface
interface MyInterface {
    void myMethod();

    // It can contain any number of default methods.
    default void method1() {
        System.out.println("Default method-1");
    }

    default void method2() {
        System.out.println("Default method-2");
    }

    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);

}

public class BasicLambda {
    public static void main(String[] args) {
       MyInterface myInterface = () -> System.out.println("Inside myMethod");
       myInterface.myMethod();
    }
}
