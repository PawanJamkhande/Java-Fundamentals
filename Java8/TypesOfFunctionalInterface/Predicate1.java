package Java8.TypesOfFunctionalInterface;


import java.util.function.Predicate;
/*
3. Predicate : It represents a boolean-valued function of one argument. It is often used for filtering or matching operations. 
              boolean test(T t);
              T is the type of the input to the operation.
              t is the input argument to the operation.
              Does not need to declare interface because it is a functional interface and it is already defined in java.util.function package.
 */
public class Predicate1 {
    public static void main(String[] args){
        Predicate<Integer> even = (n) -> n % 2 == 0;
        System.out.println(even.test(4)); // Output: true
        System.out.println(even.test(5)); // Output: false
        Predicate<String> startsWithA = (s) -> s.startsWith("A");
        System.out.println(startsWithA.test("Apple")); // Output: true
        System.out.println(startsWithA.test("Banana")); // Output: false
    }
}
