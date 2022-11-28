package com.likelion.practice.exerciseNov5;

public class PrintAtoZ {  // A ~ Z
    private void solution(char alphabet) {
        if(alphabet > 'Z') {
            return;
        }

        System.out.println(alphabet);
        solution((char)(alphabet+1));
    }

    public static void main(String[] args) {
        PrintAtoZ main = new PrintAtoZ();

        main.solution('A');
    }
}
