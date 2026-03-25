package Training;

import java.util.Scanner;

class Student{
	int rno;
	String sName;
	int m1,m2,m3;
	int total;
	double percentage;
}
public class Gradingsystem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		
		System.out.println("Enter Roll Number:");
		s1.rno=sc.nextInt();
		System.out.println("Enter Student Name:");
		s1.sName=sc.next();
		System.out.println("Enter Marks for M1:");
		s1. m1=sc.nextInt();
		System.out.println("Enter Marks for M2:");
		s1. m2=sc.nextInt();
		System.out.println("Enter Marks for M3:");
		s1. m3=sc.nextInt();
		s1.total=s1.m1+s1.m2+s1.m3;
		s1.percentage=s1.total/3;
		System.out.println("Student Roll No:"+s1.rno+"\nStudent Name:"+s1.sName+"\nTotal is:"+s1.total+"\nPercentage:"+s1.percentage);
	
		if(s1.percentage>=90) {
			System.out.println("A+ Grade");
		}
		else if(s1.percentage>=76 && s1.percentage<90) {
			System.out.println("A Grade");
		}
		else if(s1.percentage>=60 && s1.percentage<76) {
			System.out.println(" B Grade");
		}
		else if(s1.percentage>=50 && s1.percentage<60) {
			System.out.println("C Grade");
		}
		else if(s1.percentage>=35 && s1.percentage<50) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("You are Fail(:(:(:(:");
		}
		
		
		
	}

}
