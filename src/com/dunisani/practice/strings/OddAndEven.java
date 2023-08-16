package com.dunisani.practice.strings;

import java.util.Scanner;

public class OddAndEven {


    private  static Scanner scanner= new Scanner(System.in);


    public static void main(String[] args) {

        int x=scanner.nextInt();
        String str;

        scanner.nextLine();
        for (int i=0; i<x; i++){

            str=scanner.next();


            for (int j=0; j<str.length(); j++){

                if(j%2==0) System.out.print(str.charAt(j));
            }

            System.out.print(" ");

            for (int j=0; j<str.length(); j++){

                if(j%2!=0) System.out.print(str.charAt(j));
            }

            System.out.println();


        }


    }
}
