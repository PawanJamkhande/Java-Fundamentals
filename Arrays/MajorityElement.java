public class MajorityElement{
    public static void main(String[] args){
        int arr[]= {1,4,3,4,5,4,3,4,4,5,4,3,4};
        System.out.println(findMajorityVoting(arr, arr.length));
    }
    public static int findMajorityVoting(int[] arr, int n){
        int candidate = arr[0];
        int count = 1;
        for(int i=1;i<n;i++){
            if(candidate == arr[i]){
                count++;
            }else count--;
            if(count==0){
                candidate = arr[i];
                count = 1;
            }

        }
        count =0;
        for(int val : arr){
            if(val == candidate){
                count++;
            }
        }
        if(count > n/2){
            return candidate;
        }else return -1;
    }
}
