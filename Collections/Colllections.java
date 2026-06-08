package Collections;
import java.util.*;
/* Collection is nothing but group of objects 
collection is a framework that provides interfaces adn the classes which is used to store retrieve and maniulate the data
The objects are dyinamically grow and shrink
 */

public class Colllections {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1= new ArrayList<Integer>();
        // a1.add(sc.nextInt());
        // a1.add(sc.nextInt());
        // a1.add(sc.nextInt());
        // a1.add(sc.nextInt());
        // a1.add(sc.nextInt());

        System.out.println("Enter the list elements");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            Integer num = sc.nextInt();
            a1.add(num);
        }

        System.out.println(a1);
            for(int i=0;i<a1.size();i++){
                System.out.println(a1.get(i));
            }
            System.out.println("Enhanced for loop");
//if we dont use Wrapper class for enhanced for loop it will throw nullpointerexception bcz int datatype looks for interger value and The wrapper class creates an object

            for(Integer i:a1){
                System.out.println(i);
            }
        
        }

}

