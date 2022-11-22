package com.likelion.practice.exerciseNov4;

import java.util.ArrayList;
import java.util.List;

public class Recursive2 {
    private int sum(List<Integer> nums) {
        if(nums.size() == 1) {
            return nums.get(0);
        }

        int result = nums.get(0);
        nums.remove(0);
        result += sum(nums);
        return result;
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
