package OOPS;
/*
Abstraction means hiding the implementation details and show only essential information of an object 
example - when you insert the ATM card into the machine you have to enter only required option but you dont see how machine internally working on it
that hidden working is nothing but abstraction
To achieve abstraction we are using abstract class and interference 
Abstract class - it acts as a base class(parent) if we declare class a abstract we cannot create a instance of that class 
Abstract class contains abstract method as well as non abstract methods 
To declare method as a absctract class should be abstract 
At a time you can extend only one abstract class
Abstract class can contains static data
 */
abstract class  A{
	abstract void ma() ;

}
abstract class B extends A{
	abstract void mb() ;
}

abstract class C extends B{
	abstract void mc() ;
}

class Info extends C{

	@Override
	void mc() {
		System.out.println("This is class A method");
	}

	@Override
	void mb() {
		System.out.println("This is class B method");
		
	}

	@Override
	void ma() {
		System.out.println("This is class C method");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		Info i=new Info();
		
		i.ma();
		i.mb();
		i.mc();

	}

}
