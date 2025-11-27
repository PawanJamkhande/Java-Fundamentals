package org.array;

import java.util.*;

public class ArraySquare {
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
        System.out.print("[ ");
        for(int i = 0; i < n; i++) {

            System.out.print(arr[i]*arr[i]+" ,");

        }
        System.out.println("]");

        sc.close();

    }
}
