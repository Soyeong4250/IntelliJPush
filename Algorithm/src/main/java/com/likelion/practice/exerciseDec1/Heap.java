package com.likelion.practice.exerciseDec1;

import java.util.Arrays;

public class Heap {
    private int[] makeHeap(int[] arr, int parentIdx) {

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
        if(greaterIdx != parentIdx) {
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = temp;
            makeHeap(arr, greaterIdx);
        }

        return arr;
    }

    public static void main(String[] args) {
        Heap main = new Heap();

        int[] arr = {6, 5, 7, 8};

        for (int i = (arr.length-2)/2; i >= 0; i--) {
            arr = main.makeHeap(arr, i);
            System.out.println(Arrays.toString(arr));
        }
    }
}
