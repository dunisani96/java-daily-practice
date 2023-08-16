package com.dunisani.practice.maths;

public class LargestPrimeFactor {


    public static void main(String[] args) {

        System.out.println(getLargestPerimeter(24));

    }

    static  int getLargestPerimeter(int num){

        int largest=0;

        for (int i=2; i<=num; i++){

            if(num%i==0){

                largest=i;
                num/=largest;

                i--;

            }
        }
        return largest;
    }

}
