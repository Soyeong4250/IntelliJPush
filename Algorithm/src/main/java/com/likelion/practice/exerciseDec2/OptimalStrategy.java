package com.likelion.practice.exerciseDec2;

import java.util.Arrays;

class Pair {
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "{left=" + left +
                ", right=" + right +
                '}';
    }
}
public class OptimalStrategy {  // 최적의 전략 찾기
    private int solution(int[] coins) {
        Pair[][] dp = new Pair[coins.length][coins.length];

        for (int i = 0; i < coins.length; i++) {
            dp[i][i] = new Pair(coins[i], 0);
        }

        for (int i = 1; i < coins.length; i++) {
            for (int j = 0; j < coins.length - i; j++) {
                int left = coins[j];
                int right = coins[j+i];
                int x = right + dp[j][j+i-1].right;
                int y = left + dp[j+1][j+i].right;

                int second = Math.min(dp[j+1][j+i].left, dp[j][j+i-1].left);

                dp[j][j+i] = new Pair(Math.max(x, y), second);
            }
        }

        print(dp);

        return dp[0][coins.length-1].left;
    }

    private void print(Pair[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if(dp[i][j] != null) {
                    System.out.print(dp[i][j].toString());
                } else {
                    System.out.print(dp[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        OptimalStrategy main = new OptimalStrategy();
        int[] coins = {2, 7, 40, 19};
        System.out.println(Arrays.toString(coins));

        System.out.println(main.solution(coins));
    }
}
