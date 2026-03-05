package Training;
import java.util.Scanner;

public class Arthop {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no1: ");
        int no1 = sc.nextInt();
        System.out.println("Enter no2: ");
        int no2 = sc.nextInt();
        
        System.out.println("1. Multiplication ");
        System.out.println("2. Division ");
        System.out.println("3. Addition ");
        System.out.println("4. Subtraction ");
        System.out.println("5. Modulus ");

        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch) {
            case 1:
                System.out.println(no1 * no2);
                break;
            case 2:
                System.out.println(no1 / no2);
                break;
            case 3:
                System.out.println(no1 + no2);
                break;
            case 4:
                System.out.println(no1 - no2);
                break;
            case 5:
                System.out.println(no1 % no2);
                break;
            default:
                System.out.println("Invalid choice");   
        }

    
}
}