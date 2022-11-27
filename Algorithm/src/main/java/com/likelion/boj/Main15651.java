package com.likelion.boj;

import java.util.Scanner;

public class Main15651 {  // N과 M(3)
    static int N;
    static StringBuilder answer = new StringBuilder();
    private void permutation(int[] select, int idx) {
        if(idx == select.length) {
            for (int num: select) {
                answer.append(num).append(" ");
            }answer.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            select[idx] = i;
            permutation(select, idx+1);
        }
    }

    public static void main(String[] args) {
        Main15651 main = new Main15651();
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();

        main.permutation(new int[M], 0);
        System.out.println(answer.toString());
    }
}
