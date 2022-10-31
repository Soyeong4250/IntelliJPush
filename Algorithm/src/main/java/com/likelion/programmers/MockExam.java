package com.likelion.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExam {
    private int[] solution(int[] answers) {
        /*
        1. 각 수포자의 찍는 방식을 배열에 담아준다
        2. 각 수포자의 정답 개수를 담을 변수 3개 or 3길이의 배열을 선언한다
        3. answers 배열을 순회하며 각 수포자의 정답 배열과 비교하고 각 수포자의 정답 개수를 +1 해준다
        4. Math.max() 또는 for문을 이용하여 가장 많이 맞힌 수포자를 구한다.
         */

        // 수포자는 1번부터 시작하므로 배열 길이 +1
        int[] score = new int[4];

        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == student1[i]) score[1]+=1;
            if(answers[i] == student2[i]) score[2]+=1;
            if(answers[i] == student3[i]) score[3]+=1;
        }

        // 배열로 선언 시 크기 동적 할당❌ 👉 List에 담았다가 배열에 다시 담아주기
        List<Integer> list = new ArrayList<>();
        int max = Math.max(Math.max(score[0], score[1]), score[2]);
        for (int i = 1; i < score.length; i++) {
            if(max == score[i]) {
                list.add(i+1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        MockExam mockExam = new MockExam();
        int[] answers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(mockExam.solution(answers)));
    }
}
