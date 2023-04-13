package com.likelion.programmers;

public class ExpressedIntoN {  // N으로 표현
    private int solution(int n, int number) {
        return cal(n, number, 0, 0, -1);
    }

    private int cal(int n, int number, int sum, int cnt, int result) {
        if(cnt > 8 || sum > number) {
            System.out.println("초과");
            return -1;
        }

        if(sum == number) {
            if(result == -1 || cnt < result) {
                System.out.println("cnt return" + cnt);
                return cnt;
            }
        }

        int temp = 0;
        for (int i = 1; i < 9; i++) {
            temp = temp * 10 + n;

            result = cal(n, number, sum + temp, cnt+i, result);
            result = cal(n, number, sum - temp, cnt+i, result);
            result = cal(n, number, sum * temp, cnt+i, result);
            result = cal(n, number, sum / temp, cnt+i, result);
        }

        return result;
    }

    public static void main(String[] args) {
        ExpressedIntoN main = new ExpressedIntoN();

        int N = 5;
        int number = 12;

        /*int N = 2;
        int number = 11;*/

        System.out.println(main.solution(N, number));
    }
}
