package Linked_list;

public class Removelast {
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

        head = removeLast(head);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); 
    }
    public static Node removeLast(Node head){
        if(head==null){ //0 node in linked list
            return null;
        }

        if(head.next == null){ // only 1 node present in linked list
            return null;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
