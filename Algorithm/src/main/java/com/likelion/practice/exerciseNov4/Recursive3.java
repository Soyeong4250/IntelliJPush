package com.likelion.practice.exerciseNov4;

public class Recursive3 {  // 꼬리재귀 빼기
    private void recur(int n) {
        if(n <= 0) return;
        recur(n - 1);
        System.out.println(n);
        recur(n-2);
    }

    public static void main(String[] args) {
        Recursive3 main = new Recursive3();

        main.recur(3);
    }
}
