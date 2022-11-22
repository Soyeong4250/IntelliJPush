package com.likelion.practice.exerciseNov4;

public class Recursive {
    private void printTo100(int n) {
        if(n > 100) {
            return;
        }
        System.out.println(n);
        printTo100(n+1);
    }

    public static void main(String[] args) {
        Recursive recursive = new Recursive();

        recursive.printTo100(1);
    }
}
