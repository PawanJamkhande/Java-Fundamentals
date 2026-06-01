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
Abstract class can contains static data and abstract method as well as non abstract method 
We can declare final in abstract class and to call it we need to call by object 
 */

//Abstract example 1
// abstract class  A{
// 	abstract void ma() ;

// }
// abstract class B extends A{
// 	abstract void mb() ;
// }

// abstract class C extends B{
// 	abstract void mc() ;
// }

// class Info extends C{

// 	@Override
// 	void mc() {
// 		System.out.println("This is class A method");
// 	}

// 	@Override
// 	void mb() {
// 		System.out.println("This is class B method");
		
// 	}

// 	@Override
// 	void ma() {
// 		System.out.println("This is class C method");
		
// 	}
	
// }

// public class Abstraction {

// 	public static void main(String[] args) {
// 		Info i=new Info();
		
// 		i.ma();
// 		i.mb();
// 		i.mc();

// 	}

// }
/*===============================================================================*/
//Abstract example 2
// abstract class Payment{
// 	public void status() {
// 		System.out.println("=====Payment Processing===========");
// 	}
// 	abstract void paymentMethod(double amount);
// }

// class UPI extends Payment{

// 	@Override
// 	void paymentMethod(double amount) {
// 		System.out.println("Method is UPI:"+amount);
		
// 	}
	
// }
// class CreditCard extends Payment{

// 	@Override
// 	void paymentMethod(double amount) {
// 		System.out.println("Credit Card Payment:"+amount);
		
// 	}
	
// }
// class NetBanking extends Payment{

// 	@Override
// 	void paymentMethod(double amount) {
// 		System.out.println("NetBanking.."+amount);
		
// 	}
	
// }
// public class PaymentGateway {

// 	public static void main(String[] args) {
// 		UPI u=new UPI();
		
// 		CreditCard c=new CreditCard();
		
// 		NetBanking n=new NetBanking();
// 		n.status();
// 		u.paymentMethod(2000);
// 		c.paymentMethod(3000);
// 		n.paymentMethod(10000);
		
		

// 	}

// }

/*===================================================================================*/
//Abstract example 3
abstract class A1{
	abstract void a1();
	static String name="Abstract class";
	final int a=10;
}
abstract class B1 extends A1{
	abstract void b1();
}
abstract class C1 extends B1{
	abstract void c1();
}

class Test1 extends C1{

	@Override
	void c1() {
		System.out.println("=====Method c ========");
		
	}

	@Override
	void b1() {
		
		System.out.println("=====Method b ========");
	}

	@Override
	void a1() {
		System.out.println("=====Method a ========");
		
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		Test1 t=new Test1();
		
		t.a1();
		t.b1();
		t.c1();
		System.out.println(" Name:"+ A1.name+" "+" Value:"+t.a);

	}

}