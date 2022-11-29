package com.likelion.practice.exerciseNov5;

import java.util.Arrays;

public class RadixSort {
    private void sort(int[] arr) {
        int[] radixArr = new int[10];
        Arrays.fill(radixArr, -1);

        for (int i : arr) {
            radixArr[i] = i;
        }

        for (int num:radixArr) {
            if(num == -1) continue;
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        RadixSort main = new RadixSort();

        int[] arr = new int[]{7, 4, 5, 9, 1, 0};
        main.sort(arr);
    }
}
