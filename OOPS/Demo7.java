package OOPS;



// class Employee{
// 	String name="sam Dao";
// 	int age=23;
// 	int salary=30000;
// }
// //department is child class and Employee is parent
// class Department extends Employee {
// 	String deptName="HR";
// }
// public class Demo4 {

// 	public static void main(String[] args) {
// 		Department  d1=new Department();
// 		System.out.println(d1.name+" "+d1.age+" "+d1.salary+" "+d1.deptName);

// 	}


// }



// public class Demo1 {

// 	//String name="jhon","sam";//not allowed
// 	String name;
	
// 	public void disp(String name) {
// 		System.out.println("Name:"+name);
// 	}
// 	public static void main(String[] args) {
	
// 		Demo1 d=new Demo1();
// 		d.disp("sam");
// 		d.disp("jhon");


// 	}

// }



// public class Demo2 {

// 	public static void main(String[] args) {
// 		String[]name= {"sam","rohan","jhon","ajay","vijay"};
		
// 		for(int i=0;i<name.length;i++) {
// 		System.out.print(name[i]+" ");

// 	}
// 		System.out.println();
// 		}

// }


// class Animal{
// 	void eat(String name) {
// 		System.out.println(name+" "+"is eating");
// 	}
// }
// class Dog extends Animal{
// 	void eat(String name) {
// 		System.out.println(name+" "+"is eating");
// 	}
// }
// class Cat extends Animal{
// 	void eat(String name) {
// 		System.out.println(name+" "+"is talking");
// 	}
// }
// class Monkey extends Animal{
// 	void eat(String name) {
// 		System.out.println(name+" "+"is dancing");
// 	}
// }
// public class Demo4 {

// 	public static void main(String[] args) {
// 		Dog d1=new Dog();
// 		Cat c1=new Cat();
// 		Monkey m1=new Monkey();
		
// 		d1.eat("Dog");
// 		d1.eat("Cat");
// 		d1.eat("Monkey");
// 		m1.eat("Monkey");
// 		c1.eat("Cat");

// 	}

// }


// class Vehicle{
// 	void speed(int s) {
// 		System.out.println("Vehicle speed:"+s);
// 	}
// }
// class Maruti extends Vehicle{
// 	void speed(int s) {
// 		super.speed(120);
// 		System.out.println("Maruti speed:"+s);
// 	}
// }
// class Bus extends Maruti{
// 	void speed(int s) {
// 		super.speed(100);
// 		System.out.println("Bus speed:"+s);
// 	}
// }
// class ByCycle extends Bus{
// 	void speed(int s) {
// 		super.speed(90);
// 		System.out.println("ByCycle speed:"+s);
// 	}
// }
// public class Demo5 {

// 	public static void main(String[] args) {
// 		ByCycle b1=new ByCycle();
// 		b1.speed(85);
		
// 	}

// }


// class Company{
// 	String cName="Delloitte";
// }
// class Employees extends Company{
// 	String empName="Jhon smith";
// }
// class Departments extends Employees{
// 	String deptName="HR";
// }

// class Admin extends Departments{
// 	int noofHead=10;
// }
// class Info extends Company{
// 	String email="Delottie@gmail.com";
// 	String address="Pawai Mumbai";
// }
// public class Demo6 {

// 	public static void main(String[] args) {
// 		Admin a1=new Admin();
// 		System.out.println(a1.cName+" "+a1.deptName+" "+a1.empName+" "+a1.noofHead);
		
// 		Info i1=new Info();
// 		System.out.println(i1.address+" "+i1.email);

// 	}

// }


class Calci{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void add(int a, int e,String b, int c, int d) {
		System.out.println(a+e+b+c+" "+d);
	}
}
public class Demo7 {

	public static void main(String[] args) {
		Calci c1=new Calci();;
		c1.add(10, 20);
		c1.add(10, 20, 30);
		c1.add(12, 30 , " ajay ",30 ,40);

	}

}