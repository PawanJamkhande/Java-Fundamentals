package Strings;
import java.util.*;
public class StringOp {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int choise;
        do{
            System.out.println("\n .......String Menu..........");
            System.out.println("1. String length ");
            System.out.println("2. Compare Strings ");
            System.out.println("3. Concate Strings ");
            System.out.println("4. Switch Cases ");
            System.out.println("5. Exit");

            System.out.println("Enter your choise: ");
            choise = sc.nextInt();

        switch(choise){
            case 1: 
                System.out.println(str1.length());
                System.out.println(str2.length());
                break;
            case 2:
                System.out.println(str1.compareTo(str2));
                break;
            case 3:
                System.out.println(str1.concat(" "+str2));
                break;
            case 4:
                String upper1 = str1.toUpperCase();
                System.out.println("Upper case of the String 1 is: "+ upper1);
                String lower1 = str1.toLowerCase();
                System.out.println("Lower Case of the String 1 is : "+ lower1);
                String upper2 = str2.toUpperCase();
                System.out.println("Upper case of the String 2 is: "+ upper2);
                String lower2 = str2.toLowerCase();
                System.out.println("Lower Case of the String 2 is : "+ lower2);
                break;
            case 5:
                System.out.println("Exit :))");
                break;
            default:
                System.out.println("Invalid Choise");




        }}while(choise<6);

        
    }
}
