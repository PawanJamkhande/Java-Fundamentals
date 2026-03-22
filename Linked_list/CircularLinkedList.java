package Linked_list;

/*What is a Circular Linked List?

A Circular Linked List is a linked list where:

The last node points back to the first node

There is no NULL at the end

The list forms a circle*/
import java.util.Scanner;
class Node {
    int data;        // stores data
    Node next;       // reference to next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CircularLinkedList {

    Node head = null;   // first node
    Node tail = null;   // last node

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;   // circular link
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;   // maintain circular link
        }
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Delete a node
    void delete(int data) {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node previous = null;

        // If head is to be deleted
        if (head.data == data) {

            // Only one node
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            System.out.println("Node deleted");
            return;
        }

        // Delete middle or tail node
        do {
            previous = current;
            current = current.next;

            if (current.data == data) {
                previous.next = current.next;

                // If tail is deleted
                if (current == tail) {
                    tail = previous;
                }

                System.out.println("Node deleted");
                return;
            }
        } while (current != head);

        System.out.println("Element not found");
    }

    // Display list
    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // MAIN METHOD (Menu Driven)
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data;

        while (true) {
            System.out.println("\n---- Circular Linked List Menu ----");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete a Node");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    cll.insertAtBeginning(data);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    cll.insertAtEnd(data);
                    break;

                case 3:
                    System.out.print("Enter data to delete: ");
                    data = sc.nextInt();
                    cll.delete(data);
                    break;

                case 4:
                    cll.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}