import java.util.*;
public class ThreeSumTwoPointer{
    public static void main(String[] args){
        int[] arr = {999,1,0,0,0,1002,-1,-1,-2,1000};
        int target = 1000;
        solution(arr, target, arr.length);
    }
    //Using two pointer approach (O(n²) time, O(1) space)
        public static void solution(int[] a, int target, int n){
            Arrays.sort(a);
            for(int i=0;i<n;i++){
                if(i==0 || (a[i] != a[i-1])){
                    int j = i+1, k = n-1;
                    int tar = target - a[i];
                    while(j<k){
                        if(a[j] +a[k] == tar){
                            System.out.println(a[i] + " " + a[j] + " " + a[k]);
                            //ignoring the duplicates
                            while(j<k && a[j] == a[j+1]) j++;
                            while(j<k && a[k] == a[k-1]) k--;
                            j++;
                            k--;
                        }else if(a[j]+a[k]<tar){
                            j++;
                        }else{
                            k--;
                        }
                    }
                    
                }
            }
        }
    
}