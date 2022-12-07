package com.likelion.programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Scoville {  // 더 맵게
    private int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            heap.offer(scoville[i]);
        }

        while(heap.peek() < K) {
            if(heap.size() == 1) {
                return -1;
            }

            int first = heap.poll();
            int second = heap.poll();

            int result = first + second * 2;
            heap.offer(result);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scoville main = new Scoville();

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(main.solution(scoville, K));
    }
}
