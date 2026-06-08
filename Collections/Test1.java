package Collections;

import java.util.ArrayList;

public class Test1 {
 public static void main(String[] args){
    ArrayList<Integer> a1=new ArrayList<Integer>();

    //add method it add the value a1.add(value)
    //addFirst and addLast adds the element at the first and last of the list
    // set method to update the value that has been already entered in the array a1.set(index,value)
    // remove method used to remove a perticular value in the arraylist a1.remove(index)
    // if we want to clear the entire list we use clear method a1.clear()
    /* Arraylist implemented from list interface its store the element in dynamic way and it will automatically grow and shrink 
    according to data
    it maintain the insertion order
    allow the duplicate values as well as null values 
    we can retrieve data fastly using index number
    stores objects only 
    ArrayList is not thread safe*/
    

		a1.add(10);
		a1.add(20);
		a1.add(null);
		a1.add(null);
		a1.add(100);
		System.out.println(a1);
		a1.add(500);
		a1.add(600);
		System.out.println(a1);
		a1.addFirst(700);
		a1.addLast(800);
		System.out.println(a1);
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a2.add(1000);
		a2.add(2000);
		a2.add(3000);
		
		a1.addAll(a2);
		System.out.println(a1);
		a1.set(3, 5000);
		System.out.println(a1);
		if(a1.isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			System.out.println(a1);
			a1.remove(3);
		}
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		
		if(a1.isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			System.out.println(a1);
			a1.remove(3);
		}


 }   
}
