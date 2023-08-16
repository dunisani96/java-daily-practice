package com.dunisani.practice.strings;


import java.util.HashMap;

public class Test {


    public static void main(String[] args) {

      Integer a= method("1");

      if(a!=null && a==0){
          System.out.println(a);
      }
    }

    private static Integer method(String s) {

        if(Integer.parseInt(s)>0){
            return null;
        }else return 100;
    }

}
