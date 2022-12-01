package com.likelion.programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame {  //  명예의 전당
    private int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if(pq.size() < k) {
                pq.offer(score[i]);
            }else if(score[i] > pq.peek()) {
                pq.poll();
                pq.offer(score[i]);
            }
            answer[i] = pq.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        HallOfFame main = new HallOfFame();

        int k = 3;
        int[] score = new int[]{10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(main.solution(k, score)));
    }
}
