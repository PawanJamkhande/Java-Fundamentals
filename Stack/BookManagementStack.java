package Stack;
import java.util.*;
class Book {
    String stack[] = new String[100];
    int top = -1;
    int size = 100;
    int id;
    String name;
    String author;
    double price;
    int quantity;
    public Book(int id, String name, String author, double price, int quantity) {
        
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    void push(String name){
        if(top == size-1){
            System.out.println("Stack Overflow! Cannot add book.");
        }
        else{
            top++;
            stack[top]=name;
            System.out.println("Book added: "+this.name);
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow! No book to remove.");
        }
        else{
            System.out.println("Removed book: "+stack[top]);
            top--;
        }
    }

    void peek(){
        if(top==-1){
            System.out.println("No books in stack.");
        }
        else{
            System.out.println("Latest book: "+stack[top]);
        }
    }  
    void displayStack(){
        if(top==-1){
            System.out.println("No books to display.");
        }
        else{
            System.out.println("Books in stack:");
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
}
public class BookManagementStack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Book b = new Book(size, null, null, size, size);
        while(true){
            System.out.println("\n1.Push Book");
            System.out.println("2.Pop Book");
            System.out.println("3.Peek Book");
            System.out.println("4.Display Stack");
            System.out.println("5.Exit");

            System.out.print("Enter Choice : ");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter book name: ");
                    String name = sc.next();
                    b.push(name);
                    break;
                case 2:
                    b.pop();
                    break;
                case 3:
                    b.peek();
                    break;
                case 4:
                    b.displayStack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }


    }

}