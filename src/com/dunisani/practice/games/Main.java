package com.dunisani.practice.games;

public class Main {

    public static void main(String[] args) {

        Hanoi hanoi = new Hanoi(3);

        System.out.println("Printing first");
        hanoi.getFirst().print();
        System.out.println("printing second");
        hanoi.getMiddle().print();
        System.out.println("printing third");
        hanoi.getTarget().print();

        System.out.println("solving");

        hanoi.solve();

        System.out.println("Printing first");
        hanoi.getFirst().print();
        System.out.println("printing second");
        hanoi.getMiddle().print();
        System.out.println("printing third");
        hanoi.getTarget().print();


    }
}
