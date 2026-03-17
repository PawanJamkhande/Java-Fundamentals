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


class Vehicle{
	void speed(int s) {
		System.out.println("Vehicle speed:"+s);
	}
}
class Maruti extends Vehicle{
	void speed(int s) {
		super.speed(120);
		System.out.println("Maruti speed:"+s);
	}
}
class Bus extends Maruti{
	void speed(int s) {
		super.speed(100);
		System.out.println("Bus speed:"+s);
	}
}
class ByCycle extends Bus{
	void speed(int s) {
		super.speed(90);
		System.out.println("ByCycle speed:"+s);
	}
}
public class Demo6 {

	public static void main(String[] args) {
		ByCycle b1=new ByCycle();
		b1.speed(85);
		
	}

}