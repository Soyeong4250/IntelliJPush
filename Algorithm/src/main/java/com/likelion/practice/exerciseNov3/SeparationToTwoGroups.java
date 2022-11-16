package com.likelion.practice.exerciseNov3;

import java.util.Arrays;

public class SeparationToTwoGroups {
    private void solution(int[] arr, int median) {
        int pivot = arr[median];
        int start = 0;
        int end = arr.length-1;

        // pivot 왼쪽 값들은 pivot보다 작으면 swap ❌ startIdx++
        while(start <= median) {
            if(arr[start] > pivot) {
                swap(arr, start, median);
                System.out.println("바꿨습니다");
            }
            start++;
            System.out.println(Arrays.toString(arr));
        }

    }

    private void swap(int[] arr, int idx, int median) {
        int temp = arr[idx];
        arr[idx] = arr[median];
        arr[median] = temp;
    }

    public static void main(String[] args) {
        SeparationToTwoGroups main = new SeparationToTwoGroups();
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};

        int median = arr.length/2;
        main.solution(arr, median);
    }
}
