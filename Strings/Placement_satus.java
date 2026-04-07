package Strings;
import java.util.*;
import java.util.Scanner;
public class Placement_satus {
    /*Design a Java program to simulate a simple placement status checking system for students.
The system should:
Store a list of student names in an array
Store their placement status (true/false) in another array
Ask the user to enter a student name
Search for the student using a loop variable
If the student is found:
Display "🎉 Student is Placed!" if status is true
Display "❌ Not placed yet" if status is false*/
//take the input ftrom user and check the placement status of the student and display the result accordingly

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] studentNames = new String[n];
        boolean[] placementStatus = new boolean[n];
         // Consume the newline character
        for(int i=0;i<n;i++){
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();}
            for(int i=0;i<n;i++){
            System.out.print("Is the student placed? (true/false): ");
            placementStatus[i] = sc.nextBoolean();


             // Consume the newline character
        }

        
        
       
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (studentNames[i].equalsIgnoreCase(name)) {
                found = true;
                if (placementStatus[i]) {
                    System.out.println("🎉 Student is Placed!");
                } else {
                    System.out.println("❌ Not placed yet");
                }
                break;
            }
        }
        
        if (!found) {
            System.out.println("Student not found.");
        }
        
        sc.close();
    }
}