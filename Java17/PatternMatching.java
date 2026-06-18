package Java17;
import java.util.*;
/*
Pattern matching is used to typechecking, typecasting and variable declaration in single statement
instanceof keyword is used to combine typecheck and typecasting
if(object instanceof datatype variable_name){
//code
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
