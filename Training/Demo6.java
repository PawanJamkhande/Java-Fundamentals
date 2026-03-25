package Training;
import java.util.*;
// public class Credentials {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter UserName: ");
//         String pname = sc.next();
//         System.out.println("Enter the password: ");
//         String password = sc.next();
//         String u_name = "rootAdmin";
//         String pass = "root";
//         int count =0;
//         if(pname.equals(u_name)&&password.equals(pass)&&count<4){
//             System.out.println("Login Successfully!");
//             count++;
//         }
//         else if(pname==u_name && password != pass && count<4){
//             System.out.println("Wrong password! Please try again...");
//             count++;
//         }else if(pname!=u_name && count<4){
//             System.out.println("User not found!");
//             count++;
//         }
//         else if(count>3){
//             System.out.println("Too many wrong attempts. Please contact the office.");

//         }
//     }
    
// }



public class Demo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "admin";

        // 🔹 Attempt 1
        System.out.print("Enter username: ");
        String username1 = sc.next();

        System.out.print("Enter password: ");
        String password1 = sc.next();

        if (username1.equals(correctUsername) && password1.equals(correctPassword)) {
            System.out.println("Login Successful");
        } 
        else if (username1.equals(correctUsername)) {
            System.out.println(" Wrong Password (Attempt 1)");

            // 🔹 Attempt 2
            System.out.print("Enter username again: ");
            String username2 = sc.next();

            System.out.print("Enter password again: ");
            String password2 = sc.next();

            if (username2.equals(correctUsername) && password2.equals(correctPassword)) {
                System.out.println(" Login Successful");
            } 
            else if (username2.equals(correctUsername)) {
                System.out.println(" Wrong Password (Attempt 2)");

                // 🔹 Attempt 3
                System.out.print("Enter username again: ");
                String username3 = sc.next();

                System.out.print("Enter password again: ");
                String password3 = sc.next();

                if (username3.equals(correctUsername) && password3.equals(correctPassword)) {
                    System.out.println("Login Successful");
                } 
                else {
                    System.out.println("Account Locked after 3 attempts");
                }
            } 
            else {
                System.out.println("User Not Found (Attempt 2)");
                System.out.println("Account Locked");
            }
        } 
        else {
            System.out.println(" User Not Found (Attempt 1)");

            
            System.out.print("Enter username again: ");
            String username2 = sc.next();

            System.out.print("Enter password again: ");
            String password2 = sc.next();

            if (username2.equals(correctUsername) && password2.equals(correctPassword)) {
                System.out.println(" Login Successful");
            } 
            else {
                System.out.println(" Invalid Credentials (Attempt 2)");

               
                System.out.print("Enter username again: ");
                String username3 = sc.next();

                System.out.print("Enter password again: ");
                String password3 = sc.next();

                if (username3.equals(correctUsername) && password3.equals(correctPassword)) {
                    System.out.println("Login Successful");
                } 
                else {
                    System.out.println(" Account Locked after 3 attempts");
                }
            }
        }


	}

}