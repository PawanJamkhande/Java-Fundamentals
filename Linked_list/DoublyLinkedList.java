package Linked_list;

import java.util.Scanner;

public class DoublyLinkedList {


    // Node class
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at beginning
    void insertBegin(int value) {
        Node newNode = new Node(value);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
        System.out.println("Inserted at beginning");
    }

    // Insert at end
    void insertEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            System.out.println("Inserted at end");
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
        System.out.println("Inserted at end");
    }

    // Delete by value
    void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        // If head node is to be deleted
        if (temp.data == key) {
            head = temp.next;
            if (head != null)
                head.prev = null;
            System.out.println("Node deleted");
            return;
        }

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        System.out.println("Node deleted");
    }

    // Display forward
    void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("NULL <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Display backward
    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("NULL <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    // Main menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int choice;
        do {
            System.out.println("\n--- DOUBLY LINKED LIST MENU ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete by Value");
            System.out.println("4. Display Forward");
            System.out.println("5. Display Backward");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

             choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    dll.insertBegin(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    dll.insertEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    dll.delete(sc.nextInt());
                    break;

                case 4:
                    dll.displayForward();
                    break;

                case 5:
                    dll.displayBackward();
                    break;

                case 6:
                    System.out.println("Exiting program");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }  
        }while(choice!=6);
    }
}