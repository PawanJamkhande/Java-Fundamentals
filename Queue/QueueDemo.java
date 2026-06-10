package Queue;
import java.util.*;
public class QueueDemo {
    
    public static void main(String[] args){
        
        Queue <Integer> list = new LinkedList<Integer>(); // it handles null values as well as duplicate values
        list.offer(10);
        list.offer(20);
        list.offer(30);
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.peek());

        Queue <Integer> pr = new PriorityQueue<Integer>(); // priority queue does not handle null values but it handles duplicate values
        pr.offer(10);
        pr.offer(20);
        pr.offer(30);
        System.out.println(pr);
        System.out.println(pr.peek());
        System.out.println(pr.poll());
        System.out.println(pr);
        System.out.println(pr.peek());

        Queue <Integer> deq = new ArrayDeque<Integer>(); // it does not handle null values but it handles duplicate values
        deq.offer(10);
        deq.offer(20);
        deq.offer(30);
        System.out.println(deq);
        System.out.println(deq.peek());
        System.out.println(deq.poll());
        System.out.println(deq);
        System.out.println(deq.peek());
    }
}
