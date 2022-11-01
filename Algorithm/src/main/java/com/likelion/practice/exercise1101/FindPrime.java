package com.likelion.practice.exercise1101;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class FindPrime {
    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        FindPrime main = new FindPrime();

        System.out.println(main.isPrime(13, (a, b) -> (a < b)));
        System.out.println(main.isPrime(17, (a, b) -> (a < b/2)));
        System.out.println(main.isPrime(19, (a, b) -> (a * a < b)));
    }
}
