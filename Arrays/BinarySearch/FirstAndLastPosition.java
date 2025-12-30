package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,5,5,6,7,7,8,5};
        FirstAndLastIndex(arr,5);
    }
    public static void FirstAndLastIndex(int[] arr, int target) {
        int left = 0, right = arr.length-1;
        int first = -1;
        Arrays.sort(arr);
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                first = mid;
                right = mid-1;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        int last = -1;
        left =0; right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                last = mid;
                left = mid+1;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        System.out.println("First Position: " + first + ", Last Position: " + last);
    }
}