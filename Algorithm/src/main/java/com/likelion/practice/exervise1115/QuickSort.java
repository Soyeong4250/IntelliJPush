package com.likelion.practice.exervise1115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {  // 퀵 정렬

    private List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);
        return answer;
    }

    private List<Integer> solution(List<Integer> arr) {
        // 재귀를 이용한 퀵 정렬
        // 기저조건
        if(arr.size() <= 1) {
            return arr;
        }
        // 1. 기준값을 뽑는 로직 구현
        int pivot = arr.get(arr.size()/2);

        // 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if(pivot > arr.get(i)) {
                left.add(arr.get(i));
            } else if(pivot < arr.get(i)) {
                right.add(arr.get(i));
            } else {
                mid.add(arr.get(i));
            }
        }

        return merge(solution(left), mid, solution(right));
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> arrToList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrToList.add(arr[i]);
        }
        System.out.println(quickSort.solution(arrToList));
    }
}
