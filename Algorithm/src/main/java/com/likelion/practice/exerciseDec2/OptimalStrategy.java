package com.likelion.practice.exerciseDec2;

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

        for (int i = 0; i < coins.length-1; i++) {
            int left = Math.max(coins[i], coins[i+1]);
            int right = Math.min(coins[i], coins[i+1]);
            dp[i][i+1] = new Pair(left, right);
        }

        print(dp);

        return 0;
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
        int[] coins = {2, 7, 40, 19, 4, 9};

        System.out.println(main.solution(coins));
    }
}
