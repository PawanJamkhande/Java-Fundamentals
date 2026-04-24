package Training;
import java.util.*;

/*Write a code for shifting the array elements to the right k times*/
// public class Practice {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of element in the array: ");
//         int n = sc.nextInt();

//         System.out.println("Enter the "+n+" no. of element");
//         int[] arr= new int[n];
//         for(int i:arr){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the number of times to shift");
//         int k = sc.nextInt();
//         int count =0;
//         int end = arr.length-1;
//         while(count<k){        
        
//         for(int i =0;i<end;i++){
//             int temp = arr[i];
//             arr[i] = arr[end];
//             arr[end] = temp;
//             count++;
//         }
//     }
//     for(int i:arr){
//         System.out.println(arr[i]);
//     }
//     }
// }


public class Practice {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of times to shift:");
        int k = sc.nextInt();

        int count = 0;
        int end = n - 1;   

        while(count < k){        
            // for the right shift
            for(int i = end; i > 0; i--){   

                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                
            }
            //for the left shift
            // for(int i =0;i<end;i++){
            //     int temp = arr[i];
            //     arr[i] = arr[i+1];
            //     arr[i+1]=temp;
            // }
            count++;
        }

        System.out.println("Shifted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter number of elements:");
    //     int n = sc.nextInt();

    //     int[] arr = new int[n];

    //     System.out.println("Enter elements:");
    //     for(int i = 0; i < n; i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     System.out.println("Enter number of shifts:");
    //     int k = sc.nextInt();

    //     k = k % n;

    //     for(int c = 0; c < k; c++){
    //         int last = arr[n - 1];
    //         for(int i = n - 1; i > 0; i--){
    //             arr[i] = arr[i - 1];
    //         }
    //         arr[0] = last;
    //     }

    //     System.out.println("Shifted array:");
    //     for(int i = 0; i < n; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }
