package com.dunisani.practice.maths;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fiboEvenSum(34));

    }
    static  int fiboEvenSum(int n){
        int n1=1,n2=2;
        int sumOfEven=0;
        while (n1<=n){

//            System.out.println(n1+" ");

            int sum=n2+n1;

            n1=n2;
            n2=sum;


            if(n1%2==0){

                sumOfEven+=n1;
            }
        }





        return sumOfEven;
    }
}
