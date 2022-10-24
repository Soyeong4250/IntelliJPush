package com.likelion.programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int[] sliceArr = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(sliceArr);
            answer[idx++] = sliceArr[command[2]-1];
        }
        return answer;
    }

    public int[] solutionPQ(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                    pq.add(array[i]);
            }
            for (int j = 0; j < commands[i][2]; j++) {
                answer[i] = pq.poll();
            }
        }
        return answer;

    }

}
