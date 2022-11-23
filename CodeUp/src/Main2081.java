import java.util.Scanner;

public class Main2081 {
    private int[] solution() {
        // 답을 담을 변수들
        int max = -1;
        int idx = 0;
        Scanner sc = new Scanner(System.in);

        // int[] num = new int[9];
        /*for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if(max < num[i]) {
                max = num[i];
                idx = i + 1;
            }
        }*/

        int n;
        for (int i = 0; i < 9; i++) {
            n = sc.nextInt();
            if(max < n) {
                max = n;
                idx = i + 1;
            }
        }

        return new int[]{max, idx};
    }

    public static void main(String[] args) {
        Main2081 main = new Main2081();

        int[] answer = main.solution();
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
