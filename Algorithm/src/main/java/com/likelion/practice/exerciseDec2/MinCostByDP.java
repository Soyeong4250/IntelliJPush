package com.likelion.practice.exerciseDec2;

import java.util.Arrays;

public class MinCostByDP {
    private int solution(int[][] arr) {
        int[][] memo = new int[arr.length][arr[0].length];

        memo[0][0] = arr[0][0];

        for (int i = 1; i < arr.length; i++) {
            memo[i][0] = arr[i][0] + memo[i-1][0];
        }

        for (int j = 1; j < arr.length; j++) {
            memo[0][j] = arr[0][j] + memo[0][j-1];
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                memo[i][j] = arr[i][j] + Math.min(memo[i-1][j], Math.min(memo[i-1][j-1], memo[i][j-1]));
            }
            print(memo);
            System.out.println("------------");
        }


        return memo[memo.length-1][memo[0].length-1];
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
