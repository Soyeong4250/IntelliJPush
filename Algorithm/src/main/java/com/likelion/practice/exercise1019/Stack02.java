package com.likelion.practice.exercise1019;

import java.util.EmptyStackException;

public class Stack02 {

    private Integer[] arr;
    private int top = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10
        this.arr[this.top++] = value;
    }
    public int pop() {
        if(this.isEmpty()) {  // 비어있는데 pop()하는 경우
            throw new EmptyStackException();
        }
        return this.arr[--this.top];
    }

    public int peek() {
        return this.arr[this.top-1];
    }

    public boolean isEmpty() {
        return this.top == 0 ? true : false;
    }


}
