package BinarySearch;
import java.util.Scanner;

public class SearchInSorted {
    public static void main(String[] args){
        int[] arr= {9,11,14,15,20,22,25,2,3,5,7};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int minidx = findMin(arr);
        // if(target >= arr[0] && target <= arr[minidx - 1])
        int ans = binarySearch(arr,0, minidx -1, target);
        if(ans==-1){
            ans = binarySearch(arr, minidx, arr.length-1, target);
        }
        System.out.println(ans);
        sc.close();
    }
    public static int binarySearch(int[] arr, int left, int right, int target){
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static int findMin(int[] arr){
        int left =0, right = arr.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]<arr[right]){
                right = mid;
            } else{
                left = mid+1;
            }
            }
            return left;

        }
    }

