package com.likelion.practice.exerciseDec2;

import java.util.Arrays;

public class MinCostByDP {
    private int solution(int[][] arr) {
        int[][] memo = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i == 0 && j == 0) memo[0][0] = arr[0][0];
                else if(i == 0) memo[0][j] = arr[0][j] + memo[0][j-1];
                else if(j == 0) memo[i][j] = arr[i][0] + memo[i-1][0];
                else memo[i][j] = arr[i][j] + Math.min(memo[i-1][j], Math.min(memo[i-1][j-1], memo[i][j-1]));
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
