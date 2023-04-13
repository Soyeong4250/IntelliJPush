package com.likelion.programmers;

public class WordPuzzle {  // 단어 퍼즐

    static int answer;
    private int solution(String[] strs, String t) {
        answer = -1;
        func(strs, "", 0, t);

        return answer;
    }

    private void func(String[] strs, String result, int cnt, String t) {
        if(result.equals(t)) {
            if(answer == -1 || answer > cnt) {
                answer = cnt;
            }
            return;
        }

        if(result.length() > t.length() || !result.equals(t.substring(0, result.length()))){
            return;
        }

        for (int i = 0; i < strs.length; i++) {
            func(strs, result + strs[i], cnt+1, t);
        }
    }

    public static void main(String[] args) {
        WordPuzzle main = new WordPuzzle();

        String[] strs = {"ba","na","n","a"};
        String t = "banana";

        /*String[] strs = {"app","ap","p","l","e","ple","pp"};
        String t = "apple";*/

        /*String[] strs = {"ba","an","nan","ban","n"};
        String t = "banana";*/

        System.out.println(main.solution(strs, t));

    }
}
