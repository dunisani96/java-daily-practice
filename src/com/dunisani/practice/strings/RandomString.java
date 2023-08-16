package com.dunisani.practice.strings;

import java.util.Random;

public class RandomString {

    public static void main(String[] args) {


        System.out.println(randomString());




    }

    static String randomString(){

        //create array of data
        String [] data={"Hello", " Test of time","wedenesday"};

        //great a ranodom number
        Random random= new Random();

//        create an index
        int index= random.nextInt(data.length);


//        print a string
        return data[index];
    }
}
