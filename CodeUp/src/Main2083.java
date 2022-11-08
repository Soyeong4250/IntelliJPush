import java.util.Arrays;
import java.util.Scanner;

public class Main2083 {  // 이분 탐색
    private int solution(int n, int s, int[] numArr) {
        int result = -1;
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int median = (start + end) / 2;
            if(numArr[median] < s) {
                start = median + 1;
            } else if(s < numArr[median]) {
                end = median - 1;
            } else if(s == numArr[median]){
                result = median+1;  // 인덱스는 1부터 시작하기 때문에
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main2083 main = new Main2083();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }

        Arrays.sort(numArr);
        System.out.println(main.solution(n, s, numArr));
    }
}
