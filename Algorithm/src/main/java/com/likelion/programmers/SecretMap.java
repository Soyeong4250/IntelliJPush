package com.likelion.programmers;

import java.util.Arrays;

public class SecretMap {  // 비밀지도
    private char[][] solution(int n, int[] arr1, int[] arr2) {
        char[][] resultMap = new char[n][n];

        // 1. Integer.toBinaryString()을 이용하여 arr1과 arr2의 각 수를 2진수 문자열로 바꾸기
        for (int i = 0; i < n; i++) {
            String binary1 = addZero(n, Integer.toBinaryString(arr1[i]));
            String binary2 = addZero(n, Integer.toBinaryString(arr2[i]));

            // 2. 반복문 2개를 이용하여 arr1과 arr2의 각 행의 문자열을 한글자씩 순회하기
            for (int j = 0; j < n; j++) {
                // 3. 두 배열 중 1개라도 1이라면 resultMap에 #표시
                if(binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    resultMap[i][j] = '#';
                } else {  // 4. 두 배열 모두 0이라면 resultMap에 공백 표시
                    resultMap[i][j] = ' ';
                }
            }
        }

        return resultMap;
    }

    private String addZero(int n, String binary) {
        if(binary.length() < n) {
            String zero = "";
            for (int i = 0; i < n - binary.length(); i++) {
                zero += "0";
            }
            binary = zero + binary;
        }
        return binary;
    }

    private void printArr(char[][] resultMap) {
        for (int i = 0; i < resultMap.length; i++) {
            System.out.println(Arrays.toString(resultMap[i]));
        }
    }

    public static void main(String[] args) {
        SecretMap main = new SecretMap();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        char[][] resultMap = main.solution(n, arr1, arr2);
        main.printArr(resultMap);
    }

}
