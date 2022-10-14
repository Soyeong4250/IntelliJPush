import java.util.Arrays;

public class InsertionSort {
    private int[] sort(int[] arr, int i) {
        // i = 1 arr[1] j vs arr[0]
        // i = 2 일때 arr[2] j vs arr[1]
        // i = 2 일때 arr[1] j vs arr[0]
        int j = i;
        if(arr[j] < arr[j-1]) {
            // swap
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        // 5에서 출발을 합니다. idx = 1
        int[] arr = {8, 5, 6, 2, 4};
        // 첫번째 정렬 후
        arr = new int[]{5, 8, 6, 2, 4};

        InsertionSort insert = new InsertionSort();
        int[] result = insert.sort(arr, 1);
        System.out.println(Arrays.toString(result));
    }

}
