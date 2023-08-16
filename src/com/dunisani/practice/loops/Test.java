package com.dunisani.practice.loops;

public class Test {

    public static void main(String[] args) {

//        printNum(1);


        int x=10;
        int y=x++;
        System.out.println(y);
    }


    static void printNum(int n){

        if(n<=100){
            System.out.print(n+" ");
            n++;
            printNum(n);

        }

    }
}
