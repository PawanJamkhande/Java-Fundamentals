package Java8.TypesOfFunctionalInterface;


import java.util.function.BiFunction;
/*
5. BiFunction : It represents a function that accepts two arguments and produces a result. 
              It is often used for operations that require two inputs, such as combining or transforming values.
              R apply(T t, U u);
              T is the type of the first input to the operation.
              U is the type of the second input to the operation.
              R is the type of the result of the operation.
              t is the first input argument to the operation.
              u is the second input argument to the operation.
              Does not need to declare interface because it is a functional interface and it is already defined in java.util.function package.
              it accepts two input arguments and produces a result. 
              It is often used for operations that require two inputs, such as combining or transforming values.
 */
public class BiFunction1 {
    public static void main(String[] args){
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 10)); // Output: 15
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;
        System.out.println(concat.apply("Hello", " World")); // Output: Hello World
        BiFunction<String, Integer, String> info = (name, age) -> "Name: " + name + ", Age: " + age;
        System.out.println(info.apply("Alice", 25)); // Output: Name: Alice, Age: 25

        BiFunction<Integer, Integer, String> compare = (a, b) -> {
            if (a > b) {
                return a + " is greater than " + b;
            } else if (a < b) {
                return a + " is less than " + b;
            } else {
                return a + " is equal to " + b;
            }
        };
        System.out.println(compare.apply(5, 10)); // Output: 5 is less than 10
        System.out.println(compare.apply(10, 5)); // Output: 10 is greater than 5
        System.out.println(compare.apply(5, 5)); // Output: 5 is equal to 5

    }
}
