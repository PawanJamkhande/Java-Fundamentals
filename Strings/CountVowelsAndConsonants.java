package Strings;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
//        String str = "hello world";
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for(char ch : str.toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                if("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
