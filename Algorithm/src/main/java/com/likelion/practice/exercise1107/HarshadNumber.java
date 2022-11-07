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

        // 2. 나누어 떨어지는지 check 하기
        if(x%sum != 0) {
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {
        HarshadNumber harshadNumber = new HarshadNumber();

        System.out.println(harshadNumber.isHarshad(10));  // true
        System.out.println(harshadNumber.isHarshad(12));  // true
        System.out.println(harshadNumber.isHarshad(11));  // false
        System.out.println(harshadNumber.isHarshad(13));  // false
    }
}
