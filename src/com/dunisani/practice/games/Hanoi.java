package com.dunisani.practice.games;

public class Hanoi {

    private HanoiStack<Integer> first;
    private HanoiStack<Integer> middle;
    private HanoiStack<Integer> target;

    private Integer numberOfRings;

    public Hanoi(Integer numberOfRings) {
        this.first = new HanoiStack();
        this.middle = new HanoiStack<>();
        this.target = new HanoiStack<>();
        this.numberOfRings = numberOfRings;
        initHanoi();
    }

    private void initHanoi() {
        for (int i = this.numberOfRings; i >= 1; i--) {
            this.first.push(i);
        }
    }

    public void solve() {
        if (target.size() == this.numberOfRings) {
            return;
        }
        if (first.size() % 2 != 0) {
            solve(this.first, this.middle, this.target);
            this.middle.push(first.pop());
            solve(this.target,this.first,this.middle);
            target.push(first.pop());
            solveFour(this.middle,this.first,this.target);
        } else {
            solveFour(first,middle,target);
        }

    }

    public void solveN(HanoiStack<Integer> first, HanoiStack<Integer> middle, HanoiStack<Integer> target){
        if(first.size()==0){
            return;
        }

        if(first.size()==3){
            solve(first,middle,target);
            return;
        }


        if(first.size()>3 && first.size()%2==0){
            middle.push(first.pop());

        }


    }

    public void solve(HanoiStack<Integer> first, HanoiStack<Integer> middle, HanoiStack<Integer> target) {

        Integer current = first.pop();
        target.push(current);
        current = first.pop();
        middle.push(current);
        current = target.pop();
        middle.push(current);
        current = first.pop();
        target.push(current);
        current = middle.pop();
        first.push(current);
        current = middle.pop();
        target.push(current);
        current = first.pop();
        target.push(current);
    }

    public void solveFour(HanoiStack<Integer> first, HanoiStack<Integer> middle, HanoiStack<Integer> target) {
        solve(first, target, middle);
        target.push(first.pop());
        solve(middle, first, target);
    }

    public HanoiStack<Integer> getFirst() {
        return first;
    }

    public HanoiStack<Integer> getMiddle() {
        return middle;
    }

    public HanoiStack<Integer> getTarget() {
        return target;
    }
}
