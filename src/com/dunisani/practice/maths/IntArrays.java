package com.dunisani.practice.maths;

public class IntArrays {


    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,6,7,89};
        String[] strings={"chair", "phone","health","bus","sleep"};

      int size=  printArray(arr,strings);

        System.out.println(size);

    }

    static int printArray(int [] numbers, String[] strings){

        int size;
        for (int number: numbers){

            System.out.print(number+" ");
        }

        for (String string: strings){
            System.out.print(string+" ");
        }

        return strings.length+numbers.length;

    }
}
