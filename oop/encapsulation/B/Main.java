package org.oop.encapsulation.B;

import org.oop.encapsulation.A.Subclass;

public class Main extends Subclass {
    public Main(String s, double v) {
        super(s, v);
    }

    public static void main(String[] args) {
        Main obj = new Main("Hwll",23.4);
        String n = obj.s;

        A obj1 = new A();

        obj1.setSalL(23000, 12);

        System.out.println(obj1.getSal());

        System.out.println(obj1 instanceof A);
    }
}