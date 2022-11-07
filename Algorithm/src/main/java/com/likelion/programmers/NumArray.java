package com.likelion.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumArray {
    private int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        // 1. array의 각 element 중 divisor로 나누어 떨어지는 값 구하기
        // 2. 나누어 떨어지는 element가 하나도 없다면  (List의 길이가 0이라면) 배열에 -1을 담고
        //    나누어 떨어지는 element가 있다면 numList 오름차순 정렬하기
        // 3. numList와 길이가 맞는 정답 배열 생성 후 element 옮겨 담기

        return answer;
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray();

        System.out.println(Arrays.toString(numArray.solution(new int[]{5, 9, 7, 10}, 5)));
    }
}
