import java.util.Arrays;
import java.util.Scanner;

public class Main1443 {  // 삽입 정렬
    private int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Main1443 main = new Main1443();
        Scanner sc = new Scanner(System.in);

        int lng = sc.nextInt();
        int[] arr = new int[lng];

        for (int i = 0; i < lng; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = main.sort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }

}
