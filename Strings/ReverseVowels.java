package Strings;
import java.util.*;
public class ReverseVowels {
    public static void main(String[] args) {
        String str = "Reverse a vowels";
        reverseVowels(str);
    }
    public static void reverseVowels(String str){
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j){
            while(ch[i]!='i' && ch[i]!='o' && ch[i]!='u' && ch[i]!='a' && ch[i]!='e'){
                i++;
            }
            while(ch[j]!='i' && ch[j]!='o' && ch[j]!='u' && ch[j]!='a' && ch[i]!='e'){
                j--;
            }
            if(i>=j){
                break;
            }
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i++;
            j--;
        }
        for(char c: ch){
            System.out.print(c);
        }


    }
}
