package com.likelion.practice.exercise1018;

import java.util.Scanner;

public class SquareExercise {
    private void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }
    }

    public static void main(String[] args) {
        SquareExercise squareExercise = new SquareExercise();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        squareExercise.printSquare(n);
        sc.close();
    }

}
