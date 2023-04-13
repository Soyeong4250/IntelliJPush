package com.likelion.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class GemShopping {  // 보석 쇼핑
    private int[] solution(String[] gems) {

        HashSet<String> gemSet = new HashSet<>();
        for (int i = 0; i < gems.length; i++) {
            gemSet.add(gems[i]);
        }

        int start = 0;
        int end = 0;
        int len = gems.length;
        System.out.println(gemSet);

        HashMap<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < gems.length; i++) {
            hash.put(gems[i], hash.getOrDefault(gems[i], 0) + 1);
            len++;
            if(hash.size() >= gemSet.size()) {
                if(hash.get(gems[start]) > 1) {
                    hash.put(gems[start], hash.get(gems[start])-1);
                    start++;
                    len--;
                }
            }
        }

        System.out.println(start + ", " + end);


        return new int[]{start, end};
    }

    public static void main(String[] args) {
        GemShopping main = new GemShopping();

//        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
//        String[] gems = {"AA", "AB", "AC", "AA", "AC"};
//        String[] gems = {"XYZ", "XYZ", "XYZ"};
        String[] gems = {"A", "AA", "AA", "AAA", "AA", "A"};
//        String[] gems = {"ZZZ", "YYY", "NNNN", "YYY", "BBB"};
//        String[] gems = {"ZZZ"};
        System.out.println(Arrays.toString(main.solution(gems)));
    }
}
