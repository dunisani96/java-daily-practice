package com.dunisani.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HourGlass {

    public static void main(String[] args) {

        Random random= new Random();
        int[][] arr=new int[6][6];

        int x= random.nextInt(10);
        for (int i=0; i<arr.length; i++){

            for (int j=0; j<arr.length; j++){
               arr[i][j]=x;

            }
        }

        for (int i=0; i<arr.length; i++){

            for (int j=0; j<arr.length; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println("max "+ findMaxSum(arr));


        }


        static  int findMaxSum(int [][]arr){

            ArrayList<Integer> hourglasses=new ArrayList<>();

            int sum=0;

            for (int i=0; i<4; i++){

                for (int j=0; j<4; j++){

                   int tempSum= 0;
                   tempSum+=arr[i][j];
                   tempSum+=arr[i][j+1];
                   tempSum+=arr[i][j+2];
//                   middle
                   tempSum+=arr[i+1][j+1];

                    tempSum+=arr[i+2][j];
                    tempSum+=arr[i+2][j+1];
                    tempSum+=arr[i+2][j+2];
                    sum=tempSum;

                    hourglasses.add(sum);



                }
            }

            return Collections.max(hourglasses);

        }




}
