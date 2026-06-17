package Java8.TypesOfMethodReference;
/*
reference of perticular instance method of a class : It is used to refer to a particular instance method of a class.
objectname::instancemethodname
*/

import java.util.function.BiConsumer;
import java.util.function.Consumer;

class Animal{
    public void sound(String s){
        System.out.println("Animal makes a sound"+s);
    }
}

class Calculator{
    public void sum(int a, int b){
        System.out.println("Addition is: "+(a+b));
    }
}
public class InstanceMethodReference {

    public static void main(String[]args){

        Animal a = new Animal();
        Calculator c = new Calculator();

        Consumer<String>  sound = a::sound;
        sound.accept("Woof Woof");

        BiConsumer<Integer, Integer> adder = c::sum;
        adder.accept(10,20);
    }
    
}
