package com.likelion.practice.exercise1021;

import java.util.Stack;

public class Bracket2 {
    private boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if(bracket == '[' || bracket == '{' || bracket == '(') {
                stack.push(bracket);
            } else {
                char p = stack.peek();
                if(stack.isEmpty() && (bracket == ']' || bracket == '}' || bracket == ')')) return false;
                if((bracket == ']' && p == '[') || (bracket == '}' && p == '{') || (bracket == ')' && p == '(')) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Bracket2 main = new Bracket2();

        String s1 = "{}()[](({))";
        String s2 = "{}()[](({}))";
        System.out.println(main.solution(s1));
        System.out.println(main.solution(s2));
    }

}
