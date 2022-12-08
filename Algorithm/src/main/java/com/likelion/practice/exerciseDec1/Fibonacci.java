package com.likelion.practice.exerciseDec1;

public class Fibonacci {
    private long fibo(int n) {
        long[] memo = new long[n + 1];

        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }

    private long fibo1(int n) {
        if(n < 2) return 1;

        return fibo1(n-1) + fibo1(n-2);
    }


    public static void main(String[] args) {
        Fibonacci main = new Fibonacci();

        int n = 40;
        System.out.println(main.fibo(n));
        System.out.println(main.fibo1(n, new long[n+1]));
    }
}
