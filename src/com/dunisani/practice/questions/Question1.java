package com.dunisani.practice.questions;

public class Question1 {

    public static void main(String[] args) {

        int a=1;
        int b=2;
        int c=3;

        System.out.println(method1()[0]);

    }

    private  static  String [] method1(){

        String [] array= new String[1];
        StringBuilder sb= new StringBuilder();
        sb.append("Be a ");
        sb.append("java ");
        sb.append("Programmer ");
        array[0]=sb.toString();

        return array;
    }
}
