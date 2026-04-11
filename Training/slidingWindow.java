package Training;

public class slidingWindow{

    public static int slidingWindow1(int[] arr,int k){
        int sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];

        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(slidingWindow1(arr,3));
    }
}
