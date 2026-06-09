package Collections;
import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(101,"Aman");
        hmap.put(102,"Ankit");
        hmap.put(45,"Kunal");
        System.out.println(hmap);
        System.out.println(hmap.put(102,"Sharma"));
        System.out.println(hmap);
        System.out.println(hmap.get(45));
        if(hmap.containsKey(45)){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is not present");
        }

        if(hmap.containsValue("Aman")){
            System.out.println("Value is present");
        }
        else{
            System.out.println("Value is not present");
        }
        // Map.Entry is an interface that provides methods to access the key and value of a map entry
        for(Map.Entry<Integer,String> entry : hmap.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

    }
}
