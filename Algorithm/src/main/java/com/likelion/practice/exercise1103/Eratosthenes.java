package com.likelion.practice.exercise1103;

public class Eratosthenes {
    private void multipleOf(int num) {
        for(int i = 2; i<=num; i+=2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Eratosthenes main = new Eratosthenes();

        main.multipleOf(100);
    }
}
