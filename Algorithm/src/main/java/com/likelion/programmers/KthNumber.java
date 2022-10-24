package com.likelion.programmers;

import java.util.Arrays;

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
        
    }

}
