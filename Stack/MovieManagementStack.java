package Stack;


import java.util.Scanner;
import java.util.Stack;

/* ================== STACK CLASS ================== */
class MovieStack {

    String[] stack;   // Array to store movie names
    int top;          // Index of top element
    int size;         // Stack capacity

    // Constructor
    MovieStack(int size) {
        this.size = size;
       // String[]stack=new String[size];
        stack = new String[size];
        top = -1;     // Stack is empty initially
    }

    // PUSH operation
    void push(String movie) {
        if (top == size - 1) {
            System.out.println("Stack Overflow! Cannot add movie.");
        } else {
            top++;
            stack[top] = movie;
            System.out.println("Movie added: " + movie);
        }
    }

    // POP operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No movie to remove.");
        } else {
            System.out.println("Removed movie: " + stack[top]);
            top--;
        }
    }

    // PEEK operation
    void peek() {
        if (top == -1) {
            System.out.println("No movies in stack.");
        } else {
            System.out.println("Latest movie: " + stack[top]);
        }
    }

    // DISPLAY operation
    void display() {
        if (top == -1) {
            System.out.println("No movies to display.");
        } else {
            System.out.println("Movies in stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

/* ================== MAIN CLASS ================== */
public class MovieManagementStack {

    public static void main(String[] args) {

    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        sc.nextLine();   // clear buffer

        MovieStack ms = new MovieStack(size);
        int choice;

        while (true) {
            System.out.println("\n--- Movie Management Menu ---");
            System.out.println("1. Add Movie");
            System.out.println("2. Remove Movie");
            System.out.println("3. View Latest Movie");
            System.out.println("4. Display All Movies");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();   // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter movie name: ");
                    String movie = sc.nextLine();
                    ms.push(movie);
                    break;

                case 2:
                    ms.pop();
                    break;

                case 3:
                    ms.peek();
                    break;

                case 4:
                    ms.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}