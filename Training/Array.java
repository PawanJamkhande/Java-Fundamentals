package Training;

public class Array {
    public static void main(String[] args){
        String name ="Sam"; // replaces by john bcz used same variable name so the latest name will be stored in the variable
        name = "John";
        System.out.println("Name: "+name);
        System.out.println("--------------------------");

        String names[] ={"sam","john","christopher","ram","sita"};
        for(String n:names){
            System.out.println("Name: "+n);
        } 
        
        int a[] = new int[5];
        a[0]=300;
        a[1]=400;
        a[2]=500;
        a[3]=600;
        a[4]=700;
        System.out.println("---------------------------");
        for(int x:a){
            System.out.println("Elements are: "+x);
        }

        System.out.println("------------------Min Max in Array------------------");
        int arr[] = {10,20,30,40,15,5};
        for(int n:arr){
            System.out.print(n+" ");
        }System.out.println();
        
        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
            }

        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        

        System.out.println("Minimum element: "+min);
        System.out.println("Maximum element: "+max);
    }
    
}
