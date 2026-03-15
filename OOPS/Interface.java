package OOPS;
/* 
class to class = extends
class to interface = implement
interface to interface = extends
we cannot create object of interface 
interface is used to create multiple inheritance in java
you can extend more than 1 interface 
Interface specofies the set of abstract methods 
Abstraction: Interfaces hide implementation details and expose only method signatures. 
Multiple Inheritance: A class can implement multiple interfaces, enabling multiple inheritance of type. 
Default and Static Methods: Since Java 8, interfaces can include default methods (with implementation) and static methods. 
Private Methods: Java 9 introduced private and private static methods for internal logic within interfaces. 
Constants: All fields in an interface are public, static, and final by default. 
 */

interface i1{
	void show();
}
interface i2{
	void show1();
}
//multiple inheritance
interface i3 extends i1,i2{
	void show2();
}

class i4 implements i3 {

	@Override
	public void show() {
		
		System.out.println("This is show method fro interface i3");
	}

	@Override
	public void show1() {
		System.out.println("This is show method fro interface i1");
		
	}

	@Override
	public void show2() {
		System.out.println("This is show method fro interface i2");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		i4 i=new i4();
		i.show();
		i.show1();
		i.show2();

	}

}

// interface Animal {
//     void makeSound(); // Abstract method
//     default void sleep() { // Default method
//         System.out.println("Animal is sleeping");
//     }
//     static void breathe() { // Static method
//         System.out.println("Animal is breathing");
//     }
// }

// class Dog implements Animal {
//     public void makeSound() {
//         System.out.println("Bark");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.makeSound(); // Output: Bark
//         dog.sleep();     // Output: Animal is sleeping
//         Animal.breathe(); // Output: Animal is breathing
//     }
// }   