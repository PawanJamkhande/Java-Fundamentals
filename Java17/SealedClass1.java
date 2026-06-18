package Java17;
/* 
Feature of Java 17:
1) Sealed Class - It restrict which class can inherit from a parent class. 
It is used to control the inheritance of a class from parent class and to prevent unauthorized access to the class. 
It is better for security and maintainability of the code.
In sealed class for inheritance we need to use permits keyword to give permission for subclasses. and the one who is extending it shall use final keyword so that it cannot be extended further.
A sealed class can only be extended by a specific set of classes that are defined in the same package. 
If we are using final that class is restricted for further inheritance but if we want to remove that restrictions we must declare that class as NON-SEALED keyword
The syntax for defining a sealed class is as follows:
   public sealed class ClassName permits SubClass1, SubClass2, ... {
       // class body
   }
    
*/

sealed class Vehicle permits Car, Bus{
    void speed(int n){
        System.out.println("Vehicle Speed is: "+n);
    }
}
final class Car extends Vehicle{
    void speed(int n){
        System.out.println("Car speed is: "+n);
    }
}
final class Bus extends Vehicle{
    void speed(int n){
        System.out.println("Bus speed is: "+n);
    }
}
public class SealedClass1 {
    public static void main(String[] args){
        Car c = new Car();
        Bus b = new Bus();
        c.speed(100);
        b.speed(60);
    }
}
