package Java8.TypesOfMethodReference;
/*
Constructor reference : It is used to refer to a constructor of a class. 
It is used when we want to create an instance of a class using a constructor reference. 
It is used when the constructor is called to create an instance of a class. The syntax for constructor reference is as follows:
classname::new
*/

import java.util.function.Supplier;

class Person{
    Person(){
        System.out.println("Person is created");
    }
}
public class ConstructorReference {
    public static void main(String[] args){
        
        Supplier<Person> s1 = Person::new;
        s1.get();
    }
}
