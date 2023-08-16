package com.dunisani.practice.interfaces;

public class FixedStack implements Stack{
    private int [] stck;
    private int tos;


    public static void main(String[] args) {

        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);


        for (int i = 0; i < 5; i++) System.out.println(myStack1.pop());
        for (int i = 0; i < 8; i++) System.out.println(myStack2.pop());

    }


    public FixedStack(int size) {



        this.stck = new int[size];
        tos=-1;
    }

    @Override
    public void push(int item) {

        if(tos==stck.length-1){
            System.out.println("stack is full");
        }else {
            stck[++tos]=item;
        }

    }

    @Override
    public int pop() {

        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }else {

            return stck[tos--];
        }

    }
}
