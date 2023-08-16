package com.dunisani.practice.interfaces;

import java.util.Arrays;

public class DynaStack implements Stack {
    private int[] stck;
    private int tos;

    public DynaStack(int size) {

        this.stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if(tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
        }
        stck[++tos] = item;
    }

    @Override
    public int pop() {

        if (tos < 0) {
            System.out.println("Stack underFlow");
            return 0;
        } else {
            return stck[tos--];
        }
    }

    public static void main(String[] args) {


        Stack myStack;
        DynaStack stack1 = new DynaStack(5);

        FixedStack fixedStack = new FixedStack(8);


        myStack = stack1;
        for (int i = 0; i < 20; i++) myStack.push(i);

        myStack = fixedStack;
        for (int i = 0; i < 8; i++) myStack.push(i);

        myStack = stack1;
        for (int i = 0; i < 8; i++) System.out.println(myStack.pop());

        System.out.println("stack 2");
        myStack = fixedStack;
        for (int i = 0; i < 9; i++) System.out.println(myStack.pop());


    }
}
