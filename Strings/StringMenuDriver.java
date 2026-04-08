package Strings;
import java.util.*;

public class StringMenuDriver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str, str2;
        int choice;

        do{
            System.out.println("\n====== String Menu =======");
            System.out.println("1. Find length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Lowercase");
            System.out.println("4. Character at index");
            System.out.println("5. compare two string");
            System.out.println("6. Concatenate Strings");
            System.out.println("7. Check equals");
            System.out.println("8. Substring");
            System.out.println("9. Replace character");
            System.out.println("10. Exit");

            System.out.print("Enter your choise: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter the string: ");
                    str = sc.nextLine();
                    System.out.println("Length: "+str.length());
                    break;
                case 2:
                    System.out.print("Enter the string: ");
                    str = sc.nextLine();
                    System.out.println("UpperCase: "+str.toUpperCase());
                case 3:
                    System.out.print("Enter the string: ");
                    str = sc.nextLine();
                    System.out.println("Lowercase: "+str.toLowerCase());
                case 4:
                    System.out.print("Enter the string: ");
                    str=sc.nextLine();
                    System.out.println("Enter the index: ");
                    int index = sc.nextInt();
                    if(index>=0 && index<str.length()){
                        System.out.println("Character at "+index+" is: "+str.charAt(index));

                    }else System.out.println("Invalid index");
                    break;
                case 5:
                    System.out.print("Enter the first string: ");
                    str = sc.nextLine();
                    System.out.print("Enter the second string: ");
                    str2 = sc.nextLine();
                    System.out.println("Compparison of two strings are: "+str.compareTo(str2));
                    break;
                case 6:
                    System.out.print("Enter first string: ");
                    str = sc.nextLine();
                    System.out.println("Enter second string: ");
                    str2= sc.nextLine();
                    System.out.println("Concatenated string: "+str.concat(str2));
                    break;
                case 7:
                    System.out.print("Enter the string: ");
                    str= sc.nextLine();
                    System.out.print("Enter second string: ");
                    str2= sc.nextLine();
                    if(str.equals(str2)){
                        System.out.println("Strings are equals!");
                    }else System.out.println("Strings are different~!");
                    break;
                case 8:
                    System.out.print("Enter the string: ");
                    str =sc.nextLine();
                    System.out.print("Enter the start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter the end of the substring: ");
                    int end = sc.nextInt();

                    if(start>=0 && start < end && end <str.length()){
                    
                    System.out.println("Substring of the string are: "+str.substring(start, end));
                    }else System.out.println("Invalid index!");
                case 9:
                    System.out.print("Enter string: ");
                    str = sc.nextLine();
                    System.out.print("Enter character to replace: ");
                    char oldChar = sc.next().charAt(0);
                    System.out.print("Enter the new character: ");
                    char newChar = sc.next().charAt(0);

                    System.out.println("Updated string "+str.replace(oldChar,newChar));
                    break;
                case 10:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
                }
        }while(choice!=10);
        sc.close();
    }

}
