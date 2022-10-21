package com.likelion.practice.exercise1021;

import java.util.Stack;

public class Bracket2 {
    public boolean solution(String s) {
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
}
