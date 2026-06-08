package Collections;
import java.util.*;
public class LinkedListTest {
    /*it is implemented from list and Deque interface it store the elements or data as a node
    each node contains data and reference to the next node
     */
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();

        list.add("C");
        list.add("C++");
        list.add("Java");
        list.add("Python");
        System.out.println(list);

        list.addFirst("Groovy");
        list.addLast("Scala");
        list.add(2,"SpringBoot");
        System.out.println(list);


        LinkedList<String> list1=new LinkedList<String>();
        list1.add("Ruby");
        list1.add("C#");
        list1.add(".Net");

        list.addAll(list1);
        System.out.println(list);
        //Iterator collects all the elements one by one and prints,to iterate and to maintain the sequesnce of the element
        //works as a for loop
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
