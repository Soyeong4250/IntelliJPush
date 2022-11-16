package com.likelion.practice.exerciseNov2;

import java.util.Scanner;

public class IntToBinary {  // 10진수를 2진수로 바꾸어보기
    private String toBinary(int num) {
        StringBuilder sb = new StringBuilder();

        while(num > 0) {
            sb.append(num%2);
            num /= 2;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        IntToBinary main = new IntToBinary();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + "을 2진수로 바꾼 문자열은 " + main.toBinary(num) + "입니다.");
    }

}
