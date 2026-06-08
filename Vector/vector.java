package Vector;
import java.util.*;
/* It is a legacy class and it is introduced in java 1.2 version
It stores the elements in dynamic array and automatically grows
vector class is implemented by list interface
vector is a thread safe also stores duplicate and null values*/
public class vector {
    public static void main(String[] args){
        Vector v = new Vector();

        v.add("sam");
        v.add(29);
        v.add(28.98);
        v.add("c");
        System.out.println(v);

        System.out.println(v.size());
    }
}
