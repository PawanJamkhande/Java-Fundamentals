package Training;

import java.util.Scanner;

public class ArrayCrud {

	public static void main(String[] args) {
		

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter array size:");
		        int n=sc.nextInt();
		        int[] arr = new int[n];  // fixed size array
		        int size = 0;           // current number of elements

		        while (true) {
		            System.out.println("\n--- MENU ---");
		            System.out.println("1. Insert");
		            System.out.println("2. Display");
		            System.out.println("3. Update");
		            System.out.println("4. Delete");
		            System.out.println("5. Exit");

		            System.out.print("Enter choice: ");
		            int choice = sc.nextInt();

		            switch (choice) {

		                // CREATE (Insert)
		                case 1:
		                    if (size == arr.length) {
		                        System.out.println("Array is full!");
		                    } else {
		                        System.out.print("Enter element: ");
		                        arr[size] = sc.nextInt();
		                        size++;
		                        System.out.println("Element inserted.");
		                    }
		                    break;

		                // READ (Display)
		                case 2:
		                    if (size == 0) {
		                        System.out.println("Array is empty.");
		                    } else {
		                        System.out.println("Array elements:");
		                        for (int i = 0; i < size; i++) {
		                            System.out.print(arr[i] + " ");
		                        }
		                        System.out.println();
		                    }
		                    break;

		                // UPDATE
		                case 3:
		                    System.out.print("Enter index to update: ");
		                    int index = sc.nextInt();

		                    if (index >= 0 && index < size) {
		                        System.out.print("Enter new value: ");
		                        arr[index] = sc.nextInt();
		                        System.out.println("Updated successfully.");
		                    } else {
		                        System.out.println("Invalid index!");
		                    }
		                    break;

		                // DELETE
		                case 4:
		                    System.out.print("Enter index to delete: ");
		                    int delIndex = sc.nextInt();

		                    if (delIndex >= 0 && delIndex < size) {
		                        for (int i = delIndex; i < size - 1; i++) {
		                            arr[i] = arr[i + 1]; // shift left
		                        }
		                        size--;
		                        System.out.println("Deleted successfully.");
		                    } else {
		                        System.out.println("Invalid index!");
		                    }
		                    break;

		                // EXIT
		                case 5:
		                    System.out.println("Exited");
		                    return;

		                default:
		                    System.out.println("Invalid choice!");
		            }
		        }
		    }
		
	}