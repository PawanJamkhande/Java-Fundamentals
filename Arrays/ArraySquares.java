import java.util.Scanner;

public class ArraySquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " elements:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Squares:");
        for(int i = 0; i < n; i++) {
            System.out.println("[" + arr[i] * arr[i] + "]");
        }
        
        sc.close();
    }
}