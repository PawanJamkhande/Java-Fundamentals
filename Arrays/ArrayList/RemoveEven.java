package ArrayList;
import java.util.*;
public class RemoveEven {
    public static void RemoveEvenNumbers(ArrayList<Integer> list) {
        for (int i=list.size()-1;i>=0;i--){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println("ArrayList after removing even numbers: " + list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Original ArrayList: " + list);
        RemoveEvenNumbers(list);
    }
    
}