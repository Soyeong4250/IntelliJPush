package com.likelion.programmers;

import java.util.HashSet;

public class Pokemon {
    private int solution(int[] nums) {
        /*
        1. 한번에 최대로 고를 수 있는 폰켓몬은 N/2마리
        2. 순서에 상관없이 동일한 폰켓몬을 고른 경우가 중복된 경우 1가지 방법으로 취급 👉 중복 제거를 위한 Set 사용
        3. 다양한 방법 중 최대로 고른 경우의 폰켓몬의 수 return
         */
        int max = nums.length/2;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }

        if(hashSet.size() >= max) {
            return max;
        }else {
            return hashSet.size();
        }
    }

    public static void main(String[] args) {
        Pokemon main = new Pokemon();

        int[] nums = {3, 3, 3, 2, 2, 4};

        System.out.println(main.solution(nums));
    }
}
