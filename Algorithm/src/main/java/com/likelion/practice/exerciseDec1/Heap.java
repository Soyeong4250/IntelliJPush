package com.likelion.practice.exerciseDec1;

import java.util.Arrays;

public class Heap {
    private int[] sort(int[] arr, int parentIdx) {

        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx;

        // 왼쪽이 parent보다 크면 greaterIdx = leftIdx
        if(leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx]) {
            greaterIdx = leftIdx;
        }

        // 오른쪽 자식이 greater보다 크면
        if(rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        // swap
        int temp = arr[parentIdx];
        arr[parentIdx] = arr[greaterIdx];
        arr[greaterIdx] = temp;

        return arr;
    }

    public static void main(String[] args) {
        Heap main = new Heap();

        int[] arr = {6, 5, 7, 8};
        System.out.println(Arrays.toString(main.sort(arr, 1)));
        System.out.println(Arrays.toString(main.sort(arr, 0)));
    }
}
