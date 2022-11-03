package com.likelion.practice.exercise1103;

public class Eratosthenes {
    private void multipleOf(int num) {
        for(int i = 2; i*2<=num; i++) {
            System.out.printf("%d, %d\n", i, (2*i) + 2);
        }
    }

    public static void main(String[] args) {
        Eratosthenes main = new Eratosthenes();

        main.multipleOf(100);
    }
}
