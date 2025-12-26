package sorting;


import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort
        for(int i = 0; i < n - 1; i++) {
            int smallest = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // Swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        for(int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}