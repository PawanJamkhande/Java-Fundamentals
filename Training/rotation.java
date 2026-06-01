package Training;
import java.util.*;

/*Write a code for shifting the array elements to the right k times*/


// public class Practice {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements in the array:");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter the " + n + " elements:");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter number of times to shift:");
//         int k = sc.nextInt();

//         int count = 0;
//         int end = n - 1;   
//         int k = k%n;
//         while(count < k){        
//             // for the right shift
//             // for(int i = end; i > 0; i--){   

//             //     int temp = arr[i];
//             //     arr[i] = arr[i - 1];
//             //     arr[i - 1] = temp;
                
//             // }
//             // for the left shift
//             for(int i =0;i<end;i++){
//                 int temp = arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1]=temp;
//             }
//             count++;
//         }

//         System.out.println("Shifted array:");
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


    public class rotation{

        public static void reverseArray(int start, int end, int[] arr){

            while(start<end){
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end]= temp;
                start++;
                end--;
            }
        }
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            int lenOfArr = sc.nextInt();
            int arr[] = new int[lenOfArr];

            for(int i=0; i<lenOfArr; i++){
                int val = sc.nextInt();
                arr[i]=val;
            }

            int rotationNum = sc.nextInt();

            rotationNum = rotationNum%lenOfArr;
            
            //left shift
            // reverseArray(0, rotationNum-1, arr);
            // reverseArray(rotationNum, lenOfArr-1, arr);
            // reverseArray(0, lenOfArr-1, arr);
 

            //Right shift
            reverseArray(0, lenOfArr-1, arr);
            reverseArray(0, rotationNum-1, arr);
            reverseArray(rotationNum, lenOfArr-1, arr);

            for(int i=0; i<lenOfArr; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
