package com.dunisani.practice.strings;

public class StringToInt {

    public static void main(String[] args) {

        String str="234";

        try {

//            int number=Integer.parseInt(str);  //use Interger.parseint

            Integer number=Integer.valueOf(str);
            Integer.parseInt(str);

            System.out.println(number);
        }catch (NumberFormatException e){

            e.printStackTrace();
        }
    }
}
