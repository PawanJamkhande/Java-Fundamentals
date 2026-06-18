package Java17;
/*
Record is a special type of class which introduce to reduce boilerplate code for data carrying objects.
Record automatically generate fields, constructor , getters, toString(), equals() , hashcode() methods
record cannot automatically generate setters method.
*/
public record Person(int pid, String pname,String email){
    
}
