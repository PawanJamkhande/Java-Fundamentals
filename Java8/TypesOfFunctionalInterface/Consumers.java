package Java8.TypesOfFunctionalInterface;


import java.util.function.Consumer;
/*
Types of functional interface
1. Consumer : It represents an operation that accepts a single input argument and returns no result. only one arguments.
              It is often used for operations that have side effects, such as printing to the console or modifying an object.
              void Accept(T t);
              T is the type of the input to the operation.
              t is the input argument to the operation.
              Does not need to declare interface because it is a functional interface and it is already defined in java.util.function package.
*/

public class Consumers {
    public static void main(String[] args){
        Consumer <String> c = (msg) -> System.out.println(msg);
        c.accept("Hello");
    }
}
