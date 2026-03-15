package OOPS;



class Employee{
	String name="sam Dao";
	int age=23;
	int salary=30000;
}
//department is child class and Employee is parent
class Department extends Employee {
	String deptName="HR";
}
public class Demo4 {

	public static void main(String[] args) {
		Department  d1=new Department();
		System.out.println(d1.name+" "+d1.age+" "+d1.salary+" "+d1.deptName);

	}


}
