package com.likelion.practice.exercise1101;

public class FindPrime {
    // 소수 판별 방법 1
    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if(num % i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        FindPrime main = new FindPrime();

        System.out.println(main.isPrime(13));
    }
}
