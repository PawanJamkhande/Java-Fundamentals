package ArrayList;
import java.util.*;
class ArrayListExample {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        //add at the end of arraylist 
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        //add at index
        list.add(2,40);
        System.out.println(list);
        //get
        System.out.println("[" + list.get(1) + "]");
        //set this sets the new element at the place of previous one 
        list.set(3,50);
        System.out.println(list);
        //remove it removes that index element and shift the other elements
        list.remove(1);
        System.out.println(list);
        //size of the arraylist
        System.out.println("Size: " + list.size());
        //indexof gives the position of the element in the arraylist returns the elements index
        System.out.println("Index of 40: " + list.indexOf(40));
        //tostring returns the arraylist as a string
        System.out.println("ArrayList: " + list.toString());
    }
}