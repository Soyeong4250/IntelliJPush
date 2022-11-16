package com.likelion.practice.exerciseNov3;

import java.util.Arrays;

public class SeparationToTwoGroups {
    private void solution(int[] arr, int median) {
        int pivot = arr[median];
        int start = 0;
        int end = arr.length-1;

        // pivot 왼쪽 값들은 pivot보다 작으면 swap ❌ start++
        while(arr[start] < pivot) start++;
        // pivot 오른쪽 값들은 pivot보다 크면 swap ❌ end--
        while (arr[end] > pivot) end--;
        if (start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }

    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        SeparationToTwoGroups main = new SeparationToTwoGroups();
        var arr = new int[]{20, 60, 5, 19, 40, 50, 5, 45};

        int median = arr.length/2;
        main.solution(arr, median);
    }
}
