package com.likelion.practice.exerciseNov5;

import java.util.*;

public class RadixSort2 {
    private int[] getDigits(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();

        for (int num:arr) {
            if(num == 0) hash.add(1);
            else hash.add((int)(Math.log10(num + 1)));
        }

        int[] digits = new int[hash.size()];
        int idx = 0;
        for (int num : hash) {
            digits[idx++] = num;
        }

        Arrays.sort(digits);
        return digits;
    }

    public static void main(String[] args) {
        RadixSort2 main = new RadixSort2();

        int[] arr = new int[]{7, 4, 5, 9, 1, 0};
        System.out.println(Arrays.toString(main.getDigits(arr)));
    }
}
