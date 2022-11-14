package com.likelion.practice.exercise1114;

import java.util.Arrays;

public class Eratosthenes1 {

    private void solution(int[] arr, int N) {
        for (int i = 0; i * i <= N; i++) {
            int multipleOf = arr[i];
            if(arr[i] == 0) continue;
            for (int j = arr[i] + i; j < N; j+=multipleOf) {
                arr[j] = 0;
            }

            System.out.println(Arrays.toString(arr));
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Eratosthenes1 eratosthenes = new Eratosthenes1();

        int[] arr = new int[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+2;
        }

        eratosthenes.solution(arr, arr.length);
    }
}
