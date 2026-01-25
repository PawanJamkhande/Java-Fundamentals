package Linked_list;

public class RemoveAtIndex {
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
        int idx = 1;
        head = removeIndex(head, idx);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); 
    }
    public static Node removeIndex(Node head, int idx){
        //this code is only applicable when we want to remove the node in between head and tail.
        //if there is only head then go and check Removefirst.java file and if we want to remove last index then go check out Removelast.java
        if(head == null){
            return null;
        }
        if(head.next== null){
            return null;
        }
        Node temp = head;
        for(int i =0; i<idx; i++){
            temp = temp.next;
        }
        Node tempP1 = temp.next.next;
        temp.next = tempP1;
        return head;
    }
}
