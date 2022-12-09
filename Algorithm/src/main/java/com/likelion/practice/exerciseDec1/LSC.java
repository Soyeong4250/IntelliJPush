package com.likelion.practice.exerciseDec1;

import java.util.Arrays;

public class LSC {
    private int solution(String str1, String str2) {
        int[][] dp = new int[str2.length()+1][str1.length()+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], 0);
        }

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                dp[i][j] = (str2.charAt(i-1) == str1.charAt(j-1)) ? dp[i-1][j-1]+1 : Math.max(dp[i][j-1], dp[i-1][j]);
            }
//            for (int k = 0; k < dp.length; k++) {
//                System.out.println(Arrays.toString(dp[k]));
//            }
//            System.out.println("------------");
        }

        return dp[str2.length()][str1.length()];
    }

    public static void main(String[] args) {
        LSC main = new LSC();

        String str1 = "ABCDCBA";
        String str2 = "DCABDC";

        System.out.println(main.solution(str1, str2));
    }
}
