package com.likelion.practice.exerciseNov4;

import java.util.ArrayList;
import java.util.List;

public class Recursive2 {
    private int sum(List<Integer> nums) {
        if(nums.isEmpty()) {
            return 0;
        }

        return nums.remove(nums.size()-1) + sum(nums);
    }

    public static void main(String[] args) {
        Recursive2 main = new Recursive2();

        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        System.out.println(main.sum(nums));
    }
}
