import java.util.Arrays;

public class InsertionSort {
    private int[] sort(int[] arr) {
        int i =1;

        if(arr[i] < arr[i-1]) {  // arr[1] vs arr[0]
            // swap
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        // 5에서 출발을 합니다. idx = 1
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort insert = new InsertionSort();
        int[] result = insert.sort(arr);
        System.out.println(Arrays.toString(result));
    }

}
