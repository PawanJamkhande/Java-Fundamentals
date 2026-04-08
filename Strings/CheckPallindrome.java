package Strings;

public class CheckPallindrome {

    public static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(rev);
    }

    public static void main(String[] args){
        String str1="Radar";
        System.out.println(isPalindrome(str1));
    }
}
