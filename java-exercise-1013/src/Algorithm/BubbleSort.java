package Algorithm;

/*
문제 : {7, 2, 3, 9, 28, 11}에서 가장 작은 숫자가 0번 자리에 오도록 하는 알고리즘 구현
 */

import java.util.Arrays;

public class BubbleSort {
    private int[] sort(int[] arr, int i) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();

        // int[] arr = {7, 2, 3, 9, 28, 11};
        int[] result = bubble.sort(new int[]{7, 2, 3, 9, 28, 11}, 0);

        System.out.println(Arrays.toString(result));
    }

}
