package Java8;

import java.util.Arrays;
import java.util.List;

/*

It is a shorthand syntax of lambda expression and it is used to refer to a method or a constructor.
Method reference does not works on class bcz it is not a functional interface. It works on functional interface only.
It dorectly referes to the existing method
syntax : ClassName::MethodName ( System.out::println )
It is used to make the code more concise and readable. It can be used to refer to a static method, an instance method, or a constructor.

*/
public class MethodReference1 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Hello", "World", "Java", "Programming");
        System.out.println(list);

        //using lambda expression
        System.out.println("Using lambda expression:");
        list.forEach(s -> System.out.println(s));

        //using method reference
        System.out.println("Using method reference:");
        list.forEach(System.out::println);
    }
}
