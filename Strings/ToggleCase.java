package org.string;
import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
        String str = "HeLLo";
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()) {
            if(Character.isUpperCase(ch))
                sb.append(Character.toLowerCase(ch));
            else if(Character.isLowerCase(ch))
                sb.append(Character.toUpperCase(ch));
            else
                sb.append(ch);
        }
        System.out.println("Toggled: " + sb);
    }
    // OR
//    public static void main(String[] args) {
//        String str = "Hello World";
//            char[] s = str.toCharArray();
//            for(int i=0;i<s.length;i++){
//                char ch = s[i];
//                if(ch>='A' && ch <= 'Z'){
//                    char ansch = (char)(ch - 'A' + 'a');
//                    s[i] = ansch;
//                }
//                if(ch>='a' && ch<= 'z'){
//                    char ansch = (char)(ch- 'a'+'A');
//                    s[i] = ansch;
//                }
//            }
//            for(char ch: s){
//                System.out.print(ch);
//            }
//
//        }
    }


