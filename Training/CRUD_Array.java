package Training;

import java.util.Scanner;

public class CRUD_Array {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();

        int count = 0;

        int[] arr = new int[N];
        int choise;
        do{
            System.out.println("\n .......Array Menu..........");
            System.out.println("1. Insert ");
            System.out.println("2. Display ");
            System.out.println("3. Update ");
            System.out.println("4. Delete ");
            System.out.println("5. Exit");

            System.out.println("Enter your choise: ");
            choise = sc.nextInt();

            switch(choise){
                case 1:
                    if(count == N)
                    System.out.println("Array is already full please delete something to insert");
                    else{
                        System.out.println("Enter the element: ");
                        arr[count] = sc.nextInt();
                        count++;
                        System.out.println("Element inserted successfully");
                    }
                case 2:
                    if(count == 0){
                        System.out.println("Array is empty");
                    }
                    else{
                        for(int i:arr){
                            System.out.println(i+" ");
                        }
                    }
                case 3:
                    if(count == 0){
                        System.out.println("Array is empty");

                    }
                    else{
                        System.out.println("Enter the index to Update 0 to"+(count-1)+" ): ");
                        int index = sc.nextInt();
                        if(index >=0 && index < count){
                            
                        }
                    }
            }


        }while(choise!=arr.length);
    }
}
