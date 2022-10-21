package com.likelion.programmers;

import java.util.Stack;

public class Bracket {
    // 강사님 방법1 (Stack X)
    public boolean solution(String s) {
        while(s.indexOf("()") >= 0) {
            s = s.replace("()", "");
        }

        return s.length() == 0;
    }

    public boolean solution1(String s) {
        while(s.indexOf("()") >= 0) {
            String[] splitted = s.split("\\(\\)");
            s = String.join("", splitted);
        }

        return s.length() == 0;
    }
    // Stack X
    public boolean solution2(String s) {
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

    public boolean solution3(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if(bracket == '(') {
                stack.push(bracket);
            }else {
                if(stack.isEmpty()) {
                    return false;
                }else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Bracket main = new Bracket();
        String s = "(())()";

        System.out.println(main.solution(s));
        System.out.println(main.solution1(s));
        System.out.println(main.solution2(s));
        System.out.println(main.solution3(s));
    }


}
