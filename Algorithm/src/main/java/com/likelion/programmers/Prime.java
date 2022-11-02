package com.likelion.programmers;

public class Prime {
    private int solution(int n) {
        // 에라토스테네스의 체
         /*
        1. 소수인지 아닌지 판단하는 boolean 타입의 배열 선언
        2. 2~n까지 2중 for문을 순회하면서 i의 배수라면 소수 표시(isNotPrime = true)
        3. for문을 이용하여 boolean 타입 배열을 순회하며 isNotPrime = false인 것의 개수 세기
         */
        int cnt = 0;

        boolean[] isNotPrime = new boolean[n+1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for(int i=2; i<=n; i++) {
            if(!isNotPrime[i]) {
                for (int j=i*2; j<=n; j+=i) {
                    isNotPrime[j] = true;
                }
            }
        }

        for (int i = 0; i < isNotPrime.length; i++) {
            if(!isNotPrime[i]) {
                cnt++;
            }
        }

        return cnt;
    }

    private int solution1(int n) {
        // 에라토스테네스의 체
         /*
        1. 소수의 개수를 담을 변수 선언
        2. 2중 for문을 이용하여 2~n까지 탐색하되 2와 3일 경우에는 소수 이므로 따로 cnt + 1
        3. cnt값 return
         */
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            if(i == 2 || i == 3) {
                cnt += 1;
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                cnt += 1;
            }
        }

        return cnt;
    }


    public static void main(String[] args) {
        Prime main = new Prime();

        System.out.println(main.solution(10));
        System.out.println(main.solution1(10));
    }
}
