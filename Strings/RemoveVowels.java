package Strings;
public class RemoveVowels {

    public static void main(String[] args) {
        String str = "Hello World";
        removeVowels(str);
    }

    public static void removeVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                continue;
            }
            System.out.print(ch);
        }
        System.out.println();
    }
}
