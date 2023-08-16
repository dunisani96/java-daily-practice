package com.dunisani.practice.exceptions;

import java.util.Scanner;

public class BadString {

    static  Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {

        String str= scanner.next();

        try {
            int n= Integer.parseInt(str);
            System.out.println(n);
        }catch (Exception e){
            System.out.println("Bad String");
        }


    }
}
