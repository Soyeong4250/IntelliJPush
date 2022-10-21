package com.likelion.programmers;

public class Bracket {
    // 강사님 방법 (Stack X)
    private boolean solution(String s) {
        boolean answer = true;
        while(s.indexOf("()") >= 0) {
            s = s.replace("()", "");
        }

        return s.length() == 0;
    }

    // Stack X
    private boolean solution1(String s) {
        boolean answer = true;

        int result = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                result += 1;
            } else {
                result -= 1;
            }

            if(result == -1) {
                answer = false;
                break;
            }
        }

        if(result != 0) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Bracket main = new Bracket();
        String s = "(())()";

        System.out.println(main.solution(s));
        System.out.println(main.solution1(s));
    }

}
