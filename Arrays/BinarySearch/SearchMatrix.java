package BinarySearch;
import java.util.Scanner;
//Search an element in the sorted matrix
public class SearchMatrix {
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(searchInMatrix(arr,target));
    }
    public static boolean searchInMatrix(int[][] arr,int target){
        int i =0, j = arr.length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j] == target){
                return true;
            }
            else if(arr[i][j]<target){
                i++;
            }else j--;

        }
        return false;
    }
}
