package Algorithm;

/*
문제 : {7, 2, 3, 9, 28, 11}에서 가장 작은 숫자가 0번 자리에 오도록 하는 알고리즘 구현
 */

import java.util.Arrays;

public class BubbleSort {
    private int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[0] > arr[i]) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();

        int[] arr = {7, 2, 3, 9, 28, 11};
        int[] result = bubble.sort(arr);

        System.out.println(Arrays.toString(result));
    }

}
