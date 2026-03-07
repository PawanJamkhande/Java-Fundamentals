package OOPS;

//encapsulation is used for sequrity purpose and to hide the data from outside world and only provide access through getter and setter method
//In encapsulation we make the data members private and provide public getter and setter methods to access and update the value of private data members
//give me the code for encapsulation in java to undersantd the concept of encapsulation in java with proper example
public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        person.setName("Alice");
        person.setAge(30);
        

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

}
