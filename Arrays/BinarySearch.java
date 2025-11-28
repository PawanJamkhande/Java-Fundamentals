public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 6;
        int start = 0, end = arr.length - 1;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key) {
                System.out.println("Found at index " + mid);
                return;
            } else if(arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}