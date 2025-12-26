public class FirstOccurance {
    public static void main(String[] args)
    {
     int[] arr ={10,20,30,40,50,60,30};
     int n = 30;
     System.out.println(findFirstOccurrence(arr,n,0));   
    }
    public static int findFirstOccurrence(int[] arr, int n ,int i){
        
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == n){
            return i;
        }
        else{
            return findFirstOccurrence(arr,n,i+1);
        } 
            
    }
}
