package com.likelion.practice.exerciseDec2;

import java.util.Arrays;

public class MinCostByDP {
    private int solution(int[][] arr) {
        int[][] memo = new int[arr.length][arr[0].length];

        memo[0][0] = arr[0][0];

        for (int i = 1; i < arr.length; i++) {
            memo[0][i] = arr[0][i] + memo[0][i-1];
        }

        for (int j = 1; j < arr.length; j++) {
            memo[j][0] = arr[j][0] + memo[j-1][0];
        }

        print(memo);

        return 0;
    }

    private void print(int[][] memo) {
        for (int i = 0; i < memo.length; i++) {
            System.out.println(Arrays.toString(memo[i]));
        }
    }

    public static void main(String[] args) {
        MinCostByDP main = new MinCostByDP();

        int[][] arr = {{1, 3, 2},
                        {4, 6, 2},
                        {1, 2, 4}};
        System.out.println(main.solution(arr));
    }
}
