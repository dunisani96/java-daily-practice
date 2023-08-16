package com.dunisani.practice.recurssion;

public class Sum {

    public static void main(String[] args) {



            System.out.println(sumNatural(6));

    }
   static int sumNatural(int n){

        if(n>1){
            return n+sumNatural(n-1);
        }
        return 1;

    }
}
