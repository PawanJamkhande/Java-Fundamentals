package sorting;
import java.util.Scanner;
/*Insertion sort is simply comparison based sorting algorithm where final sorted arrray one element at a time by inserting each element into its correct position 
it worked likes arranging the playing cards in your hand*/

/*
Algorithm -
1) Start frpom index 1
2) compare current element with previous element
3) shift element greated than current element to right 
4) Insert element in its correct position
5) repeat same process in array length and sort  */

 class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Insertion Sort
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        for(int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}

