package Java8.Types;
import java.util.function.BiConsumer;
/*
It accept two parameters
2. BiConsumer<T,U> is a functional interface in Java that represents an operation that accepts two input arguments and returns no result. It is a specialization of the Consumer interface for operations that take two arguments. 
 The BiConsumer interface has a single abstract method called accept, which takes two parameters of types T and U, respectively.
 The accept method is used to perform the operation defined by the BiConsumer on the given input arguments. 
 The BiConsumer interface is often used for operations that have side effects, such as modifying an object or performing an action based on the input arguments. 
 The BiConsumer interface is part of the java.util.function package, which contains various functional interfaces for use with lambda expressions and method references in Java 8 and later versions.
 */
public class BiConsumer1 {
    public static void main(String[] args){
        BiConsumer<String, String> bc = (s1, s2) -> System.out.println(s1 + ", " + s2);
        bc.accept("Hello", "World"); // Output: Hello, World
        BiConsumer<Integer, Integer> bc1 = (a, b) -> System.out.println("Sum is " + (a + b));
        bc1.accept(5, 10); // Output: Sum is 15
    }
}
