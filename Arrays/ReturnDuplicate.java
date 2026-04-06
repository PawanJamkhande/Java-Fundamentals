public class ReturnDuplicate {
    public static void main(String[] args){
        int arr[]={20,20,10,10,30,40,40};
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    
                    System.out.println("Duplicate element: "+arr[i]);
                    

                    
                }

            }


        }
    }
    
}
