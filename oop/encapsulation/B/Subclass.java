package org.oop.encapsulation.B;

public class Subclass extends A {


    Subclass(String s, double v) {
        super(s,v);
    }

    public static void main(String[] args) {
        Subclass obj =  new Subclass("sample", 32.3423);
        String n = obj.s;
    }
}

class SubSubclass extends Subclass {

    SubSubclass(String s, double v) {
        super(s, v);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass("sddfd", 343.232);
        String s = obj.s;
    }
}