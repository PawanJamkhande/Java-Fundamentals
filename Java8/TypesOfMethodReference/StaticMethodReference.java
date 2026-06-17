package Java8.TypesOfMethodReference;

import java.util.function.*;

/*
Reference to static method : It is used to refer to a static method of a class. 
It is used when the method is static and it is called on the class itself rather than on an instance of the class.
classname::staticmethodname
*/
interface Calci{
    int add(int a,int b);
}
class Op{
    static int sum(int a,int b){
        return a+b;
    }
}

interface Info{
    String msg(String msg);
}
class Disp{
    static String display(String m){
        return "Message is: "+m;
    }
}

class demo{
    public static int square(int a){
        return a*a;
    }
}

class Hello{
    public static String greet(String m){
        return "Message is: "+m;
    }
}

public class StaticMethodReference {
    public static void main(String[] args){
        //Using a lambda expression to implement the functional interface

        Calci c1=(a,b)->Op.sum(a,b);
        System.out.println(c1.add(10,20));

        //Using a method reference to implement the functional interface
        //Calci is a functional interface and Op::sum is a reference to the static method sum of the class Op
        Calci c2=Op::sum;
        System.out.println(c2.add(30,40));

        //Using a method reference to implement the functional interface
        //Info is a functional interface and Disp::display is a reference to the static method display of the class Disp
        Info i1=Disp::display;
        System.out.println(i1.msg("Hello, World!"));

        Function<Integer,Integer> f1 = demo::square;
        System.out.println(f1.apply(5));

        Function<String, String> f2 = Hello::greet;
        System.out.println(f2.apply("Welcome All"));
    }
}