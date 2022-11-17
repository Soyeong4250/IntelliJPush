package com.likelion.practice.exerciseNov3;

import java.util.Arrays;

public class SeparationToTwoGroups {
    private void solution(int[]arr, int start, int end) {
        if(start >= end) return;

        int median = partition(arr, start, end);
        solution(arr, start, median-1);  // 왼쪽 배열 재귀
        solution(arr, median, end);  // 오른쪽 배열 재귀
    }
    private int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+ end)/ 2];

        while(start <= end) {
            // pivot 왼쪽 값들은 pivot보다 작으면 swap ❌ start++
            while (arr[start] < pivot) start++;
            // pivot 오른쪽 값들은 pivot보다 크면 swap ❌ end--
            while (arr[end] > pivot) end--;
            if (start <= end) {  // start와 end가 같아도 비교하는 이유 : start와 end가 다른지 판단하기 위한 시간복잡도가 늘어나기 때문
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
        return start;
    }

    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        SeparationToTwoGroups main = new SeparationToTwoGroups();
        var arr = new int[]{20, 60, 5, 19, 40, 50, 5, 45};

        main.solution(arr, 0, arr.length-1);
    }
}
