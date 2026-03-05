package Training;

import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Subject1 marks: ");
        int subject1 = sc.nextInt();
        System.out.println("Enter your Subject2 marks: ");
        int subject2 = sc.nextInt();
        System.out.println("Enter your Subject3 marks: ");
        int subject3 = sc.nextInt();

        int avg = (subject1+subject2+subject3)/3;



        if(avg >= 90){
            System.out.println("A+");
        } else if(avg >= 80){
            System.out.println("A");
        } else if(avg >= 70){
            System.out.println("B");
        } else if(avg >= 60){
            System.out.println("C");
        } else if(avg >=50){
            System.out.println("D");
        
        } else if(avg >=36){
            System.out.println("E");
        }
        
        else{
            System.out.println("F");
        }
    }
    
}
