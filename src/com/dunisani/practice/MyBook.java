package com.dunisani.practice;

public class MyBook extends Book {

    private int price;

    public MyBook(String title, String author,int price) {
        super(title, author);
        this.price=price;
        display(title,author,price);
    }

    private   void display(String title,String author,int price){
        System.out.println("title "+title );
        System.out.println("author " +author );
        System.out.println("price "+price );
    }

    public static void main(String[] args) {

        MyBook java8= new MyBook("Java 8 for Beginners","DW Makondo",170);

    }
}
