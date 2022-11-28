package com.likelion.practice.exerciseNov5;

public class CombinationOfAlphabet {
    static StringBuilder answer = new StringBuilder();
    private void combination(char[] alphabet, int idx) {
        if(idx > alphabet.length) {
            answer.append(new String(alphabet));
            answer.append('\n');
            return;
        }

        for (int i = 65; i < 91; i++) {
            alphabet[idx] = (char)i;
            combination(alphabet, idx+2);
        }
    }

    public static void main(String[] args) {
        CombinationOfAlphabet main = new CombinationOfAlphabet();
        int select = 2;
        char[] alphabet = new char[2*select-1];
        for (int i = 1; i < alphabet.length; i+=2) {
            alphabet[i] = ' ';
        }
        main.combination(alphabet, 0);
        System.out.println(answer.toString());
    }
}
