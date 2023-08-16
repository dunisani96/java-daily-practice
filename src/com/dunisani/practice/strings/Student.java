package com.dunisani.practice.strings;

public class Student {

    private String name;
    private  String lastName;
    private  int [] scores;

    public Student(String name, String lastName, int[] scores) {
        this.name = name;
        this.lastName = lastName;
        this.scores = scores;
    }


    public  char calculate(int[] arr){

        int sum=0;
        int average=0;
        for (int i=0; i<arr.length; i++){

            sum+=arr[i];

        }

        average=sum/arr.length;

        if(average>=90 && average <= 100){

            return 'O';
        }else if(average<90 && average>80){
            return 'E';
        }else if(average>70 && average<80){
            return 'A';
        }else if (average>55 && average<70){

            return 'P';
        }else if(average>40 && average<55){

            return 'D';
        }else {
            return 'T';
        }


    }

    public static void main(String[] args) {

        int[] arr= {100,80};

        Student student= new Student("Dunisani","makondo",arr);

        System.out.println(student.calculate(arr));
    }
}
