import java.util.*;

//  public class RemoveDuplicate {
//     public static void main(String[] args){
//         int[] arr = {10,10,50,40,70,50,70};
//         int n = arr.length;

//         for(int i = 0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 if(arr[i] == arr[j]){
//                     // shift elements left
//                     for(int k = j; k < n - 1; k++){
//                         arr[k] = arr[k + 1];
//                     }
//                     n--; // reduce size
//                     j--; // recheck this index
//                 }
//             }
//         }

//         // print only valid elements
//         for(int i = 0; i < n; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }



public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr = {10,10,50,40,70,50,70};

        Set<Integer> set = new LinkedHashSet<>();

        for(int num : arr){
            set.add(num);
        }

        for(int num : set){
            System.out.println(num);
        }
    }
}