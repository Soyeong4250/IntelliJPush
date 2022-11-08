package com.likelion.practice.exercise1108;

public class BinarySearch {

    private void solution(int[] nums, int targetNum) {
        int start = 0;
        int end = nums.length-1;
        int cnt = 0;

        while(start <= end) {
            cnt++;
            // 1. 중간값 찾기
            int median = (start + end)/2;
            // 2. 인덱스(시작점, 끝점 옮기기)
            // 3. targetNum과 같은지 비교하기
            if(targetNum < nums[median]) {
                end = median - 1;
                System.out.println("끝점을 " + end + "(으)로 옮깁니다.");
            } else if(nums[median] < targetNum) {
                start = median + 1;
                System.out.println("시작점을 " + start + "(으)로 옮깁니다.");
            } else if(nums[median] == targetNum) {
                System.out.println(cnt + "번만에 " + targetNum + "을 찾았습니다");
                System.out.println("현재 위치는 " + median + "입니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        binarySearch.solution(nums, 8);
    }
}
