package Collections;
import java.util.*;
public class ScannerinHash {
    public static void main(String[] args){
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of entries: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter key: ");
            int key = sc.nextInt();
            sc.nextLine(); // Consume newline left-over
            System.out.println("Enter value: ");
            String value = sc.nextLine();
            hmap.put(key, value);
        }
        for(Map.Entry<Integer,String> entry : hmap.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
    }
}
