package Linked_list;

public class Addinbetween {
    public static class Node{
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

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        Node head = n1;
        head = addInBetween(head, 3, 60);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node addInBetween(Node head,int index, int val){
        if(index == 0){
            Node n= new Node(val);
            n.next=head;
            return n;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
        }

        Node n = new Node(val);
        n.next = temp.next;
        temp.next = n;

        return head;


        }
    
}
