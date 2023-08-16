package com.dunisani.practice.games;

import java.util.ArrayList;
import java.util.List;

public class HanoiStack<T extends  Comparable> {

    private List<T> rings;

    public HanoiStack() {
        this.rings =new ArrayList<>();
    }

    public T checkTop(){
        if(rings.isEmpty()){
            return null;
        }
        int lastElementIndex = getLastElementIndex();
        return rings.get(lastElementIndex);
    }

    public T pop(){
        if(rings.isEmpty()){
            return null;
        }
        int lastElementIndex = getLastElementIndex();
        return   rings.remove(lastElementIndex);
    }


    public void push(final T element){
        int pushIndex = getLastElementIndex() + 1;
        rings.add(pushIndex,element);
    }

    public boolean isPushValid(T t){
        if(rings.isEmpty()){
            return true;
        }
        if(checkTop().compareTo(t)>0){
            return true;
        }
        return false;
    }

    public Integer size(){
        return this.rings.size();
    }

    public  void print(){

        for (T ring:rings){
            System.out.println(ring);
        }
    }

    private int getLastElementIndex() {
        return rings.size() - 1;
    }

}
