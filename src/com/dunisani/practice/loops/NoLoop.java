package com.dunisani.practice.loops;

public class NoLoop {


    public static void main(String[] args) {

        printNum(1);

    }

    static  void  printNum(int n){

        if(n<=100){
            System.out.print(n+" ");
            n++;
            printNum(n);

        }


    }
}
