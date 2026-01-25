package Linked_list;

public class SearchinLL {
      public static class Node {
        int data;
        Node next;

        Node(int val){
            this.data = val;
        }
    }
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head = n1;
        int k = 30;
        // boolean found = searchK(head,k);
        System.out.println(searchK(head,k));
        // Node temp = head;
        // while (temp != null) {
        //     // System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        // System.out.println(); 
    }
    static boolean searchK(Node head, int k){
        Node temp = head;
        int count =0; // i have initialized the count here if we want to print index of it the count will help but we are just priting whether is available or not.
        while(temp!=null){
            if(temp.data==k){
                return true;
            }
            temp = temp.next;
            count++;
        }
        return false;
    }
}
