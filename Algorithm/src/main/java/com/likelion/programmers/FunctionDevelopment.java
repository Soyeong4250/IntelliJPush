package com.likelion.programmers;

import java.util.*;

public class FunctionDevelopment {
    private int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> overtime = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            if((100 - progresses[i])%speeds[i] == 0) {
                overtime.add((100 - progresses[i])/speeds[i]);
            }else {
                overtime.add((100 - progresses[i])/speeds[i] + 1);
            }
        }

        int complete = overtime.poll();
        int cnt = 1;
        List<Integer> answerList = new ArrayList<>();
        while(!overtime.isEmpty()) {
            if(complete >= overtime.peek()) {
                overtime.poll();
                cnt++;
            }else {
                answerList.add(cnt);
                complete = overtime.poll();
                cnt = 1;
            }
        }

        answerList.add(cnt);  // 마지막 원소 삽입

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        FunctionDevelopment main = new FunctionDevelopment();

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 20, 5};

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(main.solution(progresses, speeds)));
        System.out.println(Arrays.toString(main.solution(progresses2, speeds2)));
    }

}
