package com.likelion.practice.exerciseDec2;

import java.util.Arrays;

public class SumUntil {
    private void solution(int[] coins) {
        int[][] dp = new int[coins.length][coins.length];

        for (int i = 0; i < coins.length; i++) {
            dp[i][i] = coins[i];
        }

        for (int i = 0; i < coins.length-1; i++) {
            dp[i][i+1] = dp[i][i] + dp[i+1][i+1];
        }

        for (int i = 0; i < coins.length-2; i++) {
            dp[i][i+2] = dp[i][i+1] + dp[i+1][i+2];
        }

        for (int i = 0; i < coins.length-3; i++) {
            dp[i][i+3] = dp[i][i+2] + dp[i+1][i+3];
        }

        for (int i = 0; i < coins.length-4; i++) {
            dp[i][i+4] = dp[i][i+3] + dp[i+1][i+4];
        }

        for (int i = 0; i < coins.length-5; i++) {
            dp[i][i+5] = dp[i][i+4] + dp[i+1][i+5];
        }
        print(dp);

    }

    private void print(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }

    public static void main(String[] args) {
        SumUntil main = new SumUntil();
        int[] coins = {2, 7, 40, 19, 4, 9};

        main.solution(coins);
    }
}
