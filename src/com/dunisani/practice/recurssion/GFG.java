package com.dunisani.practice.recurssion;

public class GFG {

    public static void main(String[] args) {

        int test=1;
        printFun(test);
    }

    static  void printFun(int test){
        if(test<1) {

            return;
        }
        else {
            System.out.printf("%d",test);
            printFun(test-1);
            System.out.printf("%d",test);
        }
    }
}
