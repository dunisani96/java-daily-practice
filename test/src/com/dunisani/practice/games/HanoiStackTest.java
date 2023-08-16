package com.dunisani.practice.games;

import static org.junit.jupiter.api.Assertions.*;

class HanoiStackTest {

    @org.junit.jupiter.api.Test
    void checkTop() {
        //Setup
        HanoiStack<Integer> hanoiStack = new HanoiStack();
        hanoiStack.push(1);
        hanoiStack.push(2);

        //Act
        Integer actual = hanoiStack.checkTop();

        //Assert
        assertEquals(2,actual);
    }

    @org.junit.jupiter.api.Test
    void pop() {

        //Setup
        HanoiStack<Integer> hanoiStack = new HanoiStack();
        hanoiStack.push(1);
        hanoiStack.push(2);

        //Act
        Integer actual = hanoiStack.pop();

        //Assert
        assertEquals(2,actual);
        assertEquals(1, hanoiStack.checkTop());
    }

    @org.junit.jupiter.api.Test
    void push() {

        //Setup
        HanoiStack<Integer> hanoiStack = new HanoiStack();

        //Act
       hanoiStack.push(1);

        //Assert
        assertEquals(1, hanoiStack.checkTop());
    }


    @org.junit.jupiter.api.Test
    void testIsPushValidWhenStackIsEmpty() {

        //Setup
        HanoiStack<Integer> hanoiStack = new HanoiStack();

        //Act
       boolean actual = hanoiStack.isPushValid(3);

        //Assert
        assertTrue(actual);
    }

    @org.junit.jupiter.api.Test
    void testIsPushValidWhenTopElementIsSmallerThanTheTestElement() {

        //Setup
        HanoiStack<Integer> hanoiStack = new HanoiStack();
        hanoiStack.push(3);

        //Act
        boolean actual = hanoiStack.isPushValid(5);

        //Assert
        assertFalse(actual);
    }

    @org.junit.jupiter.api.Test
    void testIsPushValidWhenTopElementIsBiggerThanTheTestElement() {

        //Setup
        HanoiStack<Integer> hanoiStack = new HanoiStack();
        hanoiStack.push(5);

        //Act
        boolean actual = hanoiStack.isPushValid(3);

        //Assert
        assertTrue(actual);
    }
}