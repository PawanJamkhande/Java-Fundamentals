package Java17;




public class PatternMatchingForSwitchCase {
    public static void main(String[] args){

        Object obj = "Stroing";

        switch(obj){
            case String s -> System.out.println("String is "+s);
            case Integer i -> System.out.println("Integer value: "+i);
            default -> System.out.println("Invalid Input");
        }
    }
    
}
