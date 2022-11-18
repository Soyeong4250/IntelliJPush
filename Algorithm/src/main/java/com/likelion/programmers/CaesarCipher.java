package com.likelion.programmers;

public class CaesarCipher { // 시저 암호
    private String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)) {
                ch = (char)((ch - 'a' + n) % 26 + 'a');
            } else if(Character.isUpperCase(ch)) {
                ch = (char)((ch - 'A' + n) % 26 + 'A');
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        CaesarCipher main = new CaesarCipher();

        System.out.println(main.solution("AB", 1));
        System.out.println(main.solution("a B z", 4));
    }

}
