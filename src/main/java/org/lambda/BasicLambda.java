package org.lambda;

@FunctionalInterface
interface MyInterface {
    void myMethod();

    default void method1() {
        System.out.println("Hello");
    }
}

public class BasicLambda {
    public static void main(String[] args) {
       MyInterface myInterface = () -> System.out.println("Inside myMethod");
       //myInterface.myMethod();
        BasicLambda a = new BasicLambda();
        a.testMethod(myInterface);
    }

    private void testMethod(MyInterface myInterface) {
        myInterface.myMethod();
    }
}
