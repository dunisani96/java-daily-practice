package com.dunisani.practice.nodes;

import java.util.Scanner;

public class LinkedList {


    static  Node insert(Node head,int data){

        if (head == null) return new Node(data);
        head.next = insert(head.next, data);
        return head;


    }

    public  static  void display(Node head){
        Node start=head;
        while (start!=null){
            System.out.print(start.data+" ");
            start=start.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Node head=null;
        int n= scanner.nextInt();

        while (n-- >0){

            int elem= scanner.nextInt();
            head=insert(head,elem);
        }

        display(head);
        scanner.close();;
    }
}
