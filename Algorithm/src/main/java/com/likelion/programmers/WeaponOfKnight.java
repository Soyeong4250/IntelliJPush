package com.likelion.programmers;

public class WeaponOfKnight {  // 기사 단원의 무기
    private int solution(int number, int limit, int power) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if(i == 1) {
                result += 1;
            } else{
                result += cntOfDivisor(i, limit, power);
            }
        }

        return result;
    }

    private int cntOfDivisor(int num, int limit, int power) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num%i == 0) {
                if(num/i == i) {
                    cnt+= 1;
                }else {
                    cnt += 2;
                }

                if(cnt > limit) {
                    cnt = power;
                    break;
                }
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        WeaponOfKnight main = new WeaponOfKnight();

//        int number = 5;
//        int limit = 3;
//        int power = 2;
        int number = 10;
        int limit = 3;
        int power = 2;
        System.out.println(main.solution(number, limit, power));
    }
}
