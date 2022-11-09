package com.likelion.practice.exercise1109;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class SelectionSort {
    private int solution(int[] numArr, int idx, StatementStrategy stmt) {
        System.out.println(Arrays.toString(numArr));
        for (int i = 0; i < numArr.length-1; i++) {
            int targetIdx = i;
            for (int j = i+1; j < numArr.length; j++) {
                if(stmt.compare(numArr[targetIdx], numArr[j])) {
                    targetIdx = j;
                }
            }
            swapValue(numArr, i, targetIdx);
            System.out.println(Arrays.toString(numArr));
        }

        return numArr[idx];
    }

    public int solution2(int[]numArr, int idx, BiFunction<Integer, Integer, Boolean> stmt) {
        for (int i = 0; i < numArr.length - 1; i++) {
            int targetIdx = i;
            for (int j = i+1; j < numArr.length; j++) {
                if(stmt.apply(numArr[targetIdx], numArr[j])) {
                    targetIdx = j;
                }
            }
            swapValue(numArr, i, targetIdx);
            System.out.println(Arrays.toString(numArr));
        }

        return numArr[idx];
    }

    private void swapValue(int[] numArr, int i, int targetIdx) {
        int temp = numArr[i];
        numArr[i] = numArr[targetIdx];
        numArr[targetIdx] = temp;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();

        int[] numArr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        // arr[0]번째에 들어갈 값 찾기
        // 그 값이 들어있는 idx 찾기
        System.out.println(selectionSort.solution(numArr, 0, (a, b) -> a > b));  // 오름차순
        System.out.println(selectionSort.solution(numArr, 0, (a, b) -> a < b));  // 내림차순

        Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
        System.out.println(fn.apply(new Integer[]{10, 20}));

        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;   // 오름차순
        System.out.println(selectionSort.solution2(numArr, 0, biFunction));
    }
}
