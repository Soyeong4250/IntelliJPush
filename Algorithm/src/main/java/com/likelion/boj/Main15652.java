package com.likelion.boj;

import java.util.Scanner;

public class Main15652 {  // N과 M(4)
    static int N;
    static StringBuilder answer = new StringBuilder();
    private void dfs(int[] select, int start, int idx) {
        if(idx == select.length) {
            for (int num : select) {
                answer.append(num).append(" ");
            }answer.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            select[idx] = i;
            dfs(select, i, idx+1);
        }
    }

    public static void main(String[] args) {
        Main15652 main = new Main15652();
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();

        main.dfs(new int[M], 1, 0);
        System.out.println(answer.toString());
    }

}
