package Training;
import java.util.*;
public class Credentials {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName: ");
        String pname = sc.next();
        System.out.println("Enter the password: ");
        String password = sc.next();
        String u_name = "rootAdmin";
        String pass = "root";
        int count =0;
        if(pname.equals(u_name)&&password.equals(pass)&&count<4){
            System.out.println("Login Successfully!");
            count++;
        }
        else if(pname==u_name && password != pass && count<4){
            System.out.println("Wrong password! Please try again...");
            count++;
        }else if(pname!=u_name && count<4){
            System.out.println("User not found!");
            count++;
        }
        else if(count>3){
            System.out.println("Too many wrong attempts. Please contact the office.");

        }
    }
    
}
