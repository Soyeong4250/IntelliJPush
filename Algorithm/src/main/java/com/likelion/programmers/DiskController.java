package com.likelion.programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DiskController {  // 디스크 컨트롤러
    private int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, ((o1, o2) -> o1[0] - o2[0]));  // 오름차순으로 정렬
//        for (int i = 0; i < jobs.length; i++) {
//            System.out.println(Arrays.toString(jobs[i]));
//        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> o1[1]-o2[1]);
        int cnt = 0;
        int time = 0;
        int idx = 0;
        while(cnt < jobs.length) {
            for (int i = idx; i < jobs.length; i++) {
                if(jobs[i][0] <= time) {
                    heap.offer(jobs[i]);
                    idx = i+1;
                }else {
                    break;
                }
            }

            if(!heap.isEmpty()){
                int[] temp = heap.poll();
                answer += temp[1] + time - temp[0];
                time += temp[1];
                cnt++;
            } else{
                time = jobs[idx][0];
            }
//            System.out.println(answer);
        }

        return answer/jobs.length;
    }

    public static void main(String[] args) {
        DiskController main = new DiskController();

        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(main.solution(jobs));
    }
}
