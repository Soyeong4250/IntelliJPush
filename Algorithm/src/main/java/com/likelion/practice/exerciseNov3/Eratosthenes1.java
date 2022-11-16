package com.likelion.practice.exerciseNov3;

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
        }

        StringBuilder prime = new StringBuilder();
        prime.append("2~50 사이의 소수는 ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) prime.append(arr[i] + " ");
        }

        System.out.println(prime.toString());
    }

    public static void main(String[] args) {
        Eratosthenes1 eratosthenes = new Eratosthenes1();

        int[] arr = new int[49];
        
        // 2~50 값 채우기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+2;
        }

        eratosthenes.solution(arr, arr.length);
    }
}
