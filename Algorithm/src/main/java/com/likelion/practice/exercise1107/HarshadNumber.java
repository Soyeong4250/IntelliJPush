package com.likelion.practice.exercise1107;

public class HarshadNumber {

    private boolean isHarshad(int x) {
        boolean result = true;
        
        // 1. 자릿수의 합 구하기
        int sum = 0;
        int remainder = x;
        while(remainder > 0) {
            sum += remainder%10;
            remainder /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        HarshadNumber harshadNumber = new HarshadNumber();

        System.out.println(harshadNumber.isHarshad(10));
    }
}
