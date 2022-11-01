package com.likelion.practice.exercise1101;

public class FindPrime {
    // 템플릿, 콜백 적용
    boolean someOperation(int a, int b) {
        return a < b;
    }

    boolean isPrime(int num) {
        for (int i = 0; someOperation(i, num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        FindPrime main = new FindPrime();

        System.out.println(main.isPrime(17));
    }
}
