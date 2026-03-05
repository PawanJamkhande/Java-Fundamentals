package sorting;
/* it is an efficient and comparison based divide and conquor algorithm
Quick sort(arr, low, high)
if low< high;
Find pivot position using partition();
recusively sort left side
recusively sort right side
- A core process of Quick Sort algorithm involves selecting the pivot element and partitioning in the array around it 
such that all elements smaller than the pivot elements to shift left side and greater element to the right side of the pivot element
this process applied recursively on sub array until entire array is sorted.
- We can consider pivot element first / last / middle anything.

 */
import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}   
