package Training;
import java.util.*;

class Studentinfo {
    int rollNo;
    String name;
    int age;
    int marks1, marks2, marks3;
    Scanner sc = new Scanner(System.in);

    void disp(){
        System.out.println("Enter roll no: ");
        rollNo = sc.nextInt();

        sc.nextLine(); 

        System.out.println("Enter Student Name: ");
        name = sc.nextLine();

        System.out.println("Enter Student Age: ");
        age = sc.nextInt();

        System.out.println("Enter Students marks");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();

        System.out.println(rollNo+" "+name+" "+age+" "+marks1+" "+marks2+" "+marks3);
    }

    void scoreCard(){
        int totalScore = marks1 + marks2 + marks3;
        System.out.println("Total Score is: " + totalScore);

        float percentage = (totalScore / 300.0f) * 100; // FIX
        System.out.println("Total Percentage is: " + percentage);
    }
}

public class Student {
    public static void main(String[] args){
        Studentinfo s1 = new Studentinfo();
        s1.disp();
        s1.scoreCard();
    }
}