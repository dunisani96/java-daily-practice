package com.dunisani.practice.maths;

import java.util.Scanner;

public class BatchDivider {

    private  static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("enter value of a");
        int a=scanner.nextInt();

        


    }




    static  int sumOfBatch(int start , int end){

        int sum=0;
        for (int i=0; i<=end; i++){

            sum+=i;
        }
        return sum;
    }
}
