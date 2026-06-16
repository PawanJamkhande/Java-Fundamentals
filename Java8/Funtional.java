package Java8;
//Java 8 is a functional programming language, which means that it supports functional programming concepts such as lambda expressions, functional interfaces, and method references.
//Functional Interface is an interface that contains only one abstract method. It can have multiple default and static methods.
//Functional interfaces are used as the basis for lambda expressions and method references in Java 8 and later versions. They provide a target type for lambda expressions, allowing you to write more concise and readable
//code when working with functional programming concepts.  
//funtional interface meaning SAM (Single Abstract Method) interface is an interface that contains only one abstract method. It can have multiple default and static methods, but it must have exactly one abstract method. Functional interfaces are used as the basis for lambda expressions and method references in Java 8 and later versions. They provide a target type for lambda expressions, allowing you to write more concise and readable code when working with functional programming concepts.
//The @FunctionalInterface annotation is used to indicate that an interface is intended to be a functional interface. It is not mandatory to use this annotation, but it helps to ensure that the interface meets the requirements of a functional interface and provides better readability for developers.
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(); // Abstract method
}
public class Funtional {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface myFunc = () -> System.out.println("Hello, Functional Interface!");
        
        // Calling the method defined in the functional interface
        myFunc.myMethod();
    }
}
