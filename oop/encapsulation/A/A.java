package org.oop.encapsulation.A;

import java.util.Scanner;

public class A {
    Scanner sc  = new Scanner(System.in);

    // to access the private data from the class we use get and set function to access it anywhere using class as ref data type
    private int l;
    double p ;
    protected String s;
    int[] arr;
    private int sal;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setSalL(int sal, int l) {
        this.sal = sal;
        this.l = l;
    }

    A(int l, double p, String s, int[] arr) {
        this.l = l;
        this.p = p;
        this.s = s;
        this.arr = arr;
    }

    public A(String s , double p){
        this.s = s;
        this.p = p;
    }

    public A(){
        this.l = 2;
        this.p = 34.543;
        this.s = "Default";
//        for (int i : this.arr = new int[5]) {
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<5; i++){
//            System.out.print(arr[i] + " ");
//        }

        this.arr = new int[] {2,3,4,3,2,5};

    }
}
