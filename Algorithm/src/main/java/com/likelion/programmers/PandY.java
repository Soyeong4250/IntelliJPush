package com.likelion.programmers;

public class PandY {  // 문자열 내 p와 y의 개수
    private boolean solution(String s) {
        s = s.toLowerCase();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') cnt++;
            else if(s.charAt(i) == 'y') cnt--;
        }

        if(cnt == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        PandY main = new PandY();

        String s = "pPoooyY";
        System.out.println(main.solution(s));
    }
}
