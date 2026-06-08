package Collections;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        super();
        this.name = name;
        this.age=age;

    }
    public void disp(){
        System.out.println("Person name: "+this.name+"/n Person Age: "+this.age);

    }

    public Person(){
        super();
    }
    

}
