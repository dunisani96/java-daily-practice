package com.dunisani.practice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Contracts {

    static Scanner scanner=  new Scanner(System.in);
    static Map<String,Integer> contacts= new HashMap<>();

    public static void main(String[] args) {

        int n= scanner.nextInt();

        for(int i=0;  i<n; i++){

            String name=scanner.next();
            int number= scanner.nextInt();
            scanner.nextLine();
            contacts.put(name,number);


        }












    }
}
