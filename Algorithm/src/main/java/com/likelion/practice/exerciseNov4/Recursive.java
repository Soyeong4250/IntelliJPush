package com.likelion.practice.exerciseNov4;

public class Recursive {
    private void printTo100(int n) {
        System.out.println(n);
        printTo100(n);
    }

    public static void main(String[] args) {
        Recursive recursive = new Recursive();

        recursive.printTo100(1);
    }
}
