/*
OPtional is an container introduced in java 8 used to handle NullPointerException
instead of returning null, method returns optional object that may contain value or may not contain value.

ifPresent() - returns true if values present otherwise false
isEmpty() - returns true if there is no value
get() - returns value if present otherwise throws NoSuchElementexpection
orElse(T other) - returns the value if present otherwise returns the default value
of(t value) - create optional containing a non null values. is value is null throws NullPointerException
ofNullable(T value) - create optional may contains value or may be empty or may be null
*/
package Java8;

import java.util.Optional;

public class Optional1{
    public static void main(String[] args){
        Optional<String> o1 = Optional.of("Hello, World!");
        
        System.out.println(o1.get());

        Optional<String> o2 = Optional.empty();
        System.out.println(o2.isEmpty());

        Optional<String> o3 = Optional.ofNullable(null);
        System.out.println(o3.isEmpty());

        // Optional<String> o4 = Optional.of(null);
        // System.out.println(o4.isEmpty());

        String s = o3.orElse("Default Value");
        System.out.println(s);

        Optional <String> email = Optional.ofNullable("abc@gmail.com");
        email.filter(e->e.contains("@")).ifPresent(e->System.out.println("Valid email: "+e));

        String error = email.orElse("Email id not found");
        System.out.println(error);

    }
}