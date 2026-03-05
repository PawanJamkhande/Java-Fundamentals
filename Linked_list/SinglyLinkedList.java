package Linked_list;

import java.util.Scanner;

public class SinglyLinkedList {
	static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at Beginning
    void insertBegin(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    void insertEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Delete by value
    void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Display
    void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int ch;
	        SinglyLinkedList list = new SinglyLinkedList();

	        do  {
	            System.out.println("\n--- Singly Linked List Menu ---");
	            System.out.println("1. Insert Begin");
	            System.out.println("2. Insert End");
	            System.out.println("3. Delete");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");

	             ch= sc.nextInt();

	            switch (ch) {
	                case 1 :
	                	System.out.println("Enter Node:");
	                	list.insertBegin(sc.nextInt());
	                break;
	                case 2 : list.insertEnd(sc.nextInt());
	                break;
	                case 3 : list.delete(sc.nextInt());
	                break;
	                case 4 :list.display();
	                break;
	                case 5 : System.out.println("Bye Bye :):)");
	                break;
	                default :System.out.println("Invalid choice");
	            }
	        }while(ch!=5);
	    }
	}
