package Training;
import java.util.*;
public class Credentials {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName: ");
        String pname = sc.next();
        System.out.println("Enter the password: ");
        String password = sc.next();

        if(pname.equals("rootAdmin")&&password.equals("root")){
            System.out.println("Valid Credentials");
        }
        else System.out.println("Incorrect credentials");
    }
    
}
