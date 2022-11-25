package com.likelion.programmers;

import java.util.Arrays;

public class Budget {  // 예산
    private int solution(int[] d, int budget) {
        int cnt = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if(budget < d[i]) break;
            budget -= d[i];
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Budget main = new Budget();
         int[] d = new int[]{1,3, 2, 5, 4};
         int budget = 9;

        System.out.println(main.solution(d, budget));
    }
}
