package Training;

//Wrapper class
/* this class wrapped the premitive datatypes into the objects
We can create the object of wrapper class 
ex- Integer I1 = new Integer(); */
// public class Test1 {
//     public static void main(String[] args){
//         System.out.println(10+30);
        
//         int x=100;
//         System.out.println("The value is: "+x);

//         int a = 10;
//         int b=20;
//         int sum = a+b;
//         System.out.println("sum: "+ (sum));



//     }
// }
/*
Q) Take one class student and display name = sam and age = 18 */
class Student{
    static void display(String sname, int age){
        System.out.println(sname+" "+age);
    }
    public static void main(String[] args){
        int age = 18;
        String name = "Sam";

        System.out.println("The name is: "+name+ " & age is: "+age);
        Student s= new Student();
        s.display("akash",18);
    }
    }
/* function has a return type but method has no return type */
