package com.likelion.programmers;

import java.util.HashMap;
import java.util.Map;

// 수업 풀이
public class Marathon1 {
    private String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            if(!memo.containsKey(key)) {
                memo.put(key, 0);
            }
            memo.put(key, memo.get(key) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, memo.get(key) - 1);
        }
        String answer = "";
        for (String key:memo.keySet()) {
            if(memo.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Marathon1 main = new Marathon1();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(main.solution(participant, completion));
    }

}
