import java.util.Arrays;
import java.util.Scanner;

public class Main3014 {  // 정렬을 빠르게!
    private void solution(int[] arr, int start, int end) {
        if(start >= end) return;

        int median = partition(arr, start, end);
        solution(arr, start, median-1);
        solution(arr, median, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end) / 2];

        while(start <= end) {
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end) {
                swap(arr, start, end);
                start++;
                end--;
//                System.out.println(Arrays.toString(arr));
            }
        }

        return start;
    }

    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        Main3014 main = new Main3014();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        main.solution(arr, 0, n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
