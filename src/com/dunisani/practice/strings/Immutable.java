package com.dunisani.practice.strings;

public class Immutable {


    public static void main(String[] args) {

        String hello="hello";
        String hi=hello+"world";
        hi=hello;
        System.out.println(hi+hello);


        String s1="1";
        String s2="2".concat(s1);
        s2=s2.concat("3");

        System.out.println(System.identityHashCode(s1));

        System.out.println(s2);


        int x=1;
        int y=11;
        Object obj1= x+y;
        Object obj2=12;

        System.out.println(obj1==obj2);


        String str2="hello";
        String str3="hello world";
        String str=str2+"world";

        System.out.println(str3==str);


    }
}
