package BinarySearch;
//Finding minimum element in sorted-rotated array
public class FindingMin {
    public static void main(String[] args){
        int[] arr= {4,5,6,7,1,2,3};
        System.out.println(" the minimum element is "+arr[findMin(arr)]+ " At index " +findMin(arr) );
    }
    public static int findMin(int[]arr){
        int left =0, right = arr.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]<arr[right]){
                right = mid;
            }else{
                left = mid+1;
            }
            }
            return left;
        }
    }

