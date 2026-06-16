package Java8.Types;
import java.util.function.Function;
/*
5. Function : It represents a function that accepts one argument and produces a result. It is often used for transformations or computations. 
              R apply(T t);
              T is the type of the input to the operation.
              R is the type of the result of the operation.
              t is the input argument to the operation.
              Does not need to declare interface because it is a functional interface and it is already defined in java.util.function package.
              Accept one input and return one output
*/
public class Function1 {
    public static void main(String[] args){
        Function<Integer, String> f = (n) -> "Number is " + n;
        System.out.println(f.apply(5)); // Output: Number is 5
        Function<String, Integer> length = (s) -> s.length();
        System.out.println(length.apply("Hello")); // Output: 5
    }
}
