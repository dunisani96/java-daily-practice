package com.dunisani.practice.recurssion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fact(5));

    }
    static int fact(int n){

       if(n>=1) return n*fact(n-1);
       else return 1;


    }
}
