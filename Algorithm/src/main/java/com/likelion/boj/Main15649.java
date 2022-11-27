package com.likelion.boj;

import java.util.Scanner;

public class Main15649 {  // N과 M(1)
    static int N;
    static StringBuilder answer = new StringBuilder();
    private void solution(int[] select, boolean[] v, int idx) {
        if(idx == select.length) {
            for (int i = 0; i < select.length; i++) {
                answer.append(select[i]).append(" ");
            }answer.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if(!v[i]) {
                v[i] = true;
                select[idx] = i;
                solution(select, v, idx + 1);
                v[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Main15649 main = new Main15649();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();

        main.solution(new int[M], new boolean[N+1],0);
        System.out.println(answer.toString());
    }
}
