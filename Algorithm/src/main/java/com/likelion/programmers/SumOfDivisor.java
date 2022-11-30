package com.likelion.programmers;

public class SumOfDivisor {  // 약수의 합
    private int solution(int n) {
        int sum = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                if(i == n/i) {
                    sum += i;
                }else {
                    sum += i;
                    sum += n / i;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfDivisor main = new SumOfDivisor();

        int n = 12;
        System.out.println(main.solution(n));
    }
}
