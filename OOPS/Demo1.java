package OOPS;
/* 
we cannot create object of interface 
interface is used to create multiple inheritance in java
you can extend more than 1 interface 
Interface is 

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
public class Demo1 {

	public static void main(String[] args) {
		i4 i=new i4();
		i.show();
		i.show1();
		i.show2();

	}

}