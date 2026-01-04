import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args){
        int[] arr={1,2,3};
        printPermutation(arr, 0, new boolean[arr.length], new ArrayList<Integer>());
    }
    public static void printPermutation(int[] arr, int pos, boolean[] selected, ArrayList<Integer> ans){
        if(pos == arr.length){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<arr.length;i++){
            if(selected[i]==false){
                selected[i] = true;
                ans.add(arr[i]);
                printPermutation(arr,pos+1,selected,ans);
                ans.remove(ans.size()-1);
                selected[i]=false;
            }
        }

    }
    
}
