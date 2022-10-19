package com.likelion.practice.exercise1004.even_odd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*용준이와 봉찬이는 공기 놀이로 내기를 하였다.
        만약 홀수개의 돌을 쥐게 되면 용준이가 이기게 되고, 짝수개의 돌을 쥐게 되면 봉찬이가 이기는 것으로 룰을 정하였다.
        어떤 자연수가 입력되면  홀수이면 "odd"을 출력하고, 짝수이면 "even"을 출력하시오.  */

        Scanner sc = new Scanner(System.in);
        // 숫자 입력 받기
        int N = sc.nextInt();

        if(N%2 != 0) {  // 홀수일 경우
            System.out.println("odd");
        } else {  // 짝수일 경우
            System.out.println("even");
        }
    }

}
