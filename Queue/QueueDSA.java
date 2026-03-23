package Queue;

import java.util.Scanner;

public class QueueDSA {

    int[] queue;    // array for queue
    int front, rear, size;

    // Constructor
    QueueDSA(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    void enqueue(int data) {

        // Check overflow
        if (rear == size - 1) {
            System.out.println("Queue Overflow!");
            return;
        }

        // First element insertion
        if (front == -1) {
            front = 0;
        }

        queue[++rear] = data;
        System.out.println("Inserted: " + data);
    }

    // Dequeue operation
    void dequeue() {

        // Check underflow
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Deleted: " + queue[front]);
        front++;
    }

    // Peek operation
    void peek() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // Display queue
    void display() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Main method (Menu Driven)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        QueueDSA q = new QueueDSA(size);
        int choice;

        while (true) {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue(Add element)");
            System.out.println("2. Dequeue(Remove element)");
            System.out.println("3. Peek(search top element from queue)");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    q.enqueue(sc.nextInt());
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}