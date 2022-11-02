package com.likelion.programmers;

public class Prime {
    private int solution(int n) {
        // 에라토스테네스의 체
        int cnt = 0;
        /*
        1. 소수인지 아닌지 판단하는 boolean 타입의 배열 선언
        2. 2~n까지 2중 for문을 순회하면서 i의 배수라면 소수 표시(isNotPrime = true)
        3. for문을 이용하여 boolean 타입 배열을 순회하며 isNotPrime = false인 것의 개수 세기
         */

        return cnt;
    }


    public static void main(String[] args) {
        Prime main = new Prime();

        System.out.println(main.solution(10));
    }
}
