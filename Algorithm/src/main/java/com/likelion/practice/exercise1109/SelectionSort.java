package com.likelion.practice.exercise1109;

import java.util.Arrays;

public class SelectionSort {
    private int solution(int[] numArr, int idx) {
        System.out.println(Arrays.toString(numArr));
        for (int i = 0; i < numArr.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < numArr.length; j++) {
                if(numArr[j] < numArr[minIdx]) {
                    minIdx = j;
                }
            }
            if(numArr[minIdx] < numArr[i]) {
                swapValue(numArr, i, minIdx);
            }
            System.out.println(Arrays.toString(numArr));
        }

        return numArr[idx];
    }

    private void swapValue(int[] numArr, int i, int minIdx) {
        int temp = numArr[i];
        numArr[i] = numArr[minIdx];
        numArr[minIdx] = temp;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();

        int[] numArr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        // arr[0]번째에 들어갈 값 찾기
        // 그 값이 들어있는 idx 찾기
        System.out.println(selectionSort.solution(numArr, 0));
    }
}
