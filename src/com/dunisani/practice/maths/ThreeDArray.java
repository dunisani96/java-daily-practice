package com.dunisani.practice.maths;

public class ThreeDArray {

    public static void main(String[] args) {


        int[][][] threeD= new int[4][4][5];

        int i, j,k=0;

        for (i=0; i<4; i++){
            for (j=0; j<4; j++){
                for (k=0; k<5; k++){
                    threeD[i][j][k]=i*j*k;

                }
            }
        }

        for (i=0; i<4; i++){
            for (j=0; j<4; j++){
                for (k=0; k<5; k++){
                    System.out.print(threeD[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();

        }

    }
}