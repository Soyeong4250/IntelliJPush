package com.likelion.practice.exerciseNov4;

public class Recursive1 {
    private int solution(int[] array, int idx) {
        int result = 0;
        if(idx == array.length-1) {
            return array[idx];
        }

        result += array[idx] + solution(array, idx+1);
        return result;
    }

    public static void main(String[] args) {
        Recursive1 main = new Recursive1();

        int[] array = {7, 3, 2, 9};
        System.out.println(main.solution(array, 0));
    }

}
