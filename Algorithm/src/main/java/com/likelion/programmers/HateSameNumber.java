package com.likelion.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class HateSameNumber {
    private int[] solution(int[] arr) {
        List<Integer> numList = new ArrayList<>();

        int pre = arr[0];
        numList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
                if(pre == arr[i]) {
                    continue;
                }else {
                    pre = arr[i];
                    numList.add(arr[i]);
                }
        }

        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }

        return answer;
    }

    private int[] solution2(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = answer.length-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        HateSameNumber main = new HateSameNumber();

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4,4,4,3,3};
        System.out.println(Arrays.toString(main.solution(arr)));
        System.out.println(Arrays.toString(main.solution(arr2)));

        System.out.println(Arrays.toString(main.solution2(arr)));
        System.out.println(Arrays.toString(main.solution2(arr2)));
    }
}
