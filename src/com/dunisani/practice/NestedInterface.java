package com.dunisani.practice;

public class NestedInterface {



    public  interface  NestedIf{

        int add(int a , int b);

    }
}

class  B implements  NestedInterface.NestedIf{

    @Override
    public int add(int a, int b) {
        return a+b;
    }


    public static void main(String[] args) {

        NestedInterface.NestedIf nestedIf= new B();
        int x=nestedIf.add(12,23);

        System.out.println(x);

    }
}
