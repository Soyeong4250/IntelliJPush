package com.likelion.programmers;

public class SecretMap2 {
    private String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        String bitOper;

        for (int i = 0; i < n; i++) {
            bitOper = Integer.toBinaryString(arr1[i] | arr2[i]).replace("1", "#").replace("0", " ");
            result[i] = " ".repeat(n - bitOper.length()) + bitOper;
        }
        return result;
    }

    private void printArr(String[] resultMap) {
        for (int i = 0; i < resultMap.length; i++) {
            System.out.println(resultMap[i]);
        }
    }

    public static void main(String[] args) {
        SecretMap2 main = new SecretMap2();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] resultMap = main.solution(n, arr1, arr2);
        main.printArr(resultMap);
    }
}
