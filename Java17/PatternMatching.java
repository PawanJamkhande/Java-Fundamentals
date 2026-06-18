package Java17;
import java.util.*;
/*
Pattern matching is used to typechecking, typecasting and variable declaration in single statement
instanceof keyword is used to combine typecheck and typecasting
if(object instanceof datatype variable_name){
//code

It allows you to use type patterns directly inside a switch statement.
Instead of writinhg a multiple if-else condition with instanceof you can write more readable code.
}

*/
public class PatternMatching {
    public static void main(String[] args){
        Object x = "String";
        
        if(x instanceof String y){
            System.out.println("Length of string: "+y.length());
            System.out.println(y.toUpperCase());
        }
    }
    
}
