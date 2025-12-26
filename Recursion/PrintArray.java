public class PrintArray {
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50,60};
        PrintArray(arr,0);
    }
    public static void PrintArray(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        PrintArray(arr,i+1);
    }
}
