package com.likelion.practice.exerciseDec2;

public class MinCostByDP {
    private int solution(int[][] arr) {
        int[][] memo = new int[arr.length][arr[0].length];


        return 0;
    }

    public static void main(String[] args) {
        MinCostByDP main = new MinCostByDP();

        int[][] arr = {{1, 3, 2},
                        {4, 6, 2},
                        {1, 2, 4}};
        System.out.println(main.solution(arr));
    }
}
