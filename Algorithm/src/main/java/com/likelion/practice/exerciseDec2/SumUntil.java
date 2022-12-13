package com.likelion.practice.exerciseDec2;

import java.util.Arrays;

public class SumUntil {
    private void solution(int[] coins) {
        int[][] dp = new int[coins.length][coins.length];

        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j < coins.length - i; j++) {
                if(i == 0) dp[j][j] = coins[j];
                else dp[j][j+i] = dp[j][j+i-1] + dp[j+1][j+i];
            }
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
