package com.likelion.programmers;

import java.util.HashMap;

public class Marathon {
    private String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            hashMap.put(participant[i], hashMap.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            if(hashMap.get(completion[i]) != null) {
                hashMap.put(completion[i], hashMap.get(completion[i]) - 1);
            }
        }

        for (String key:hashMap.keySet()) {
            if(hashMap.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Marathon main = new Marathon();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(main.solution(participant, completion));
    }

}
