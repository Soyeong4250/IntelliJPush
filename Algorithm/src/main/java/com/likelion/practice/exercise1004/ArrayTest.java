package com.likelion.practice.exercise1004;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        // 10칸의 int array를 만들고
        int[] arr = new int[10];
        // 1부터 10까지 채워보세요
        for (int i = 1; i <= 10; i++) {
            arr[i-1] = i;
        }
        // 그리고 console에 출력해보세요.
        System.out.println(Arrays.toString(arr));
    }

}
