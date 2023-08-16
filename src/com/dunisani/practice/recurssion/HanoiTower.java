package com.dunisani.practice.recurssion;

public class HanoiTower {

    public static void main(String[] args) {

        tower(8,'S','D','A');

    }
    static  void tower(int n, char sourcePole, char destinationPole, char auxillaryPole){
    int count=0;
        if(0==n)
            return;

            tower(n-1,sourcePole,auxillaryPole,destinationPole);

        System.out.printf("Move the disk %d from %c to %c\n",n,sourcePole,destinationPole);

        tower(n-1,auxillaryPole,destinationPole,sourcePole);



    }
}
