package OOPS.Abstraction;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println(name + " Salary = ₹" + salary);
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double rate;

    PartTimeEmployee(String name, int hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    void calculateSalary() {
        System.out.println(name + " Salary = ₹" + (hours * rate));
    }
}

class Intern extends Employee {
    double stipend;

    Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    void calculateSalary() {
        System.out.println(name + " Stipend = ₹" + stipend);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Rahul", 50000);
        Employee e2 = new PartTimeEmployee("Aman", 50, 200);
        Employee e3 = new Intern("Priya", 10000);

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}
