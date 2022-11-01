package com.likelion.practice.exercise1101;

public class FindPrime {
    // 소수 판별 방법 1
    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    // 소수 판별 방법 2
    public boolean isPrime2(int num) {
        for (int i = 2; i < num/2; i++) {
            if(num % i == 0) return false;
        }

        return true;
    }

    // 소수 판별 방법 3
    public boolean isPrime3(int num) {
        for (int i = 2; i*i < num; i++) {
            if(num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        FindPrime main = new FindPrime();

        System.out.println(main.isPrime(13));
        System.out.println(main.isPrime2(13));
        System.out.println(main.isPrime3(13));
    }
}
