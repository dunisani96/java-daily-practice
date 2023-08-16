package com.dunisani.practice.loops;

public class DiagonalStar {


    public static void main(String[] args) {

        printSquare(8);
    }

    static  void printSquare(int n){

        if(n<5){

            System.out.println("Invalid Value");
        }else {

            for (int row=1; row<=n; row++){

                for (int col=1; col<=n; col++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
