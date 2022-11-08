import java.util.Scanner;

public class Main3001 {  // 데이터 탐색
    private int solution(int n, int[] numArr, int k) {
        int result = -1;

        for (int i = 1; i <= n; i++) {
            if(numArr[i] == k) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main3001 main = new Main3001();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            numArr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(main.solution(n, numArr, k));
    }
}
