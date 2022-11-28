package com.likelion.practice.exerciseNov5;

public class PrintAtoZ {  // A ~ Z
    private void solution(char alphabet) {
        if(alphabet > 'Z') {
            return;
        }

        System.out.println(alphabet);
        solution((char)(alphabet+1));
    }

    private void solution2() {
        for (int i = 65; i < 91; i++) {
            System.out.println((char)i);
        }
    }

    public static void main(String[] args) {
        PrintAtoZ main = new PrintAtoZ();

        System.out.println("-----solution------");
        main.solution('A');
        System.out.println("-----solution2------");
        main.solution2();
    }
}
