package com.dunisani.practice.maths;

public class MultipleOf3and5 {


    public static void main(String[] args) {

        System.out.println("The sum is "+getSumOfMultiplesOf3and5(1000));
    }


    static int getSumOfMultiplesOf3and5(int num){

        int sum=0;

        for (int i=0; i<num; i++){

            if(i%3==0 || i%5==0){

                sum+=i;
            }
        }

        return sum;
    }
}
