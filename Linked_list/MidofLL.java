package Linked_list;

public class MidofLL {
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
        head = findMid(head);
        // Node temp = head;
        System.out.print(head.data);
        // while(temp!=null){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        // System.out.println();
    }
    public static Node findMid(Node head){
        if(head == null){
            return null;
        }
        Node sp=head;
        Node fp=head;
        while(fp!= null && fp.next!= null){

            fp = fp.next.next;
            sp= sp.next;


        }
        head = sp;
        return head;
    }
}
