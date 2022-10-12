import java.util.Scanner;

public class Main_2081 {
    private void solution(int max, int idx) {
        Scanner sc = new Scanner(System.in);

        // int[] num = new int[9];
        /*for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if(max < num[i]) {
                max = num[i];
                idx = i + 1;
            }
        }*/

        int n = -1;
        for (int i = 0; i < 9; i++) {
            n = sc.nextInt();
            if(max < n) {
                max = n;
                idx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }

    public static void main(String[] args) {
        Main_2081 main = new Main_2081();
        
        // 답을 담을 변수들
        int max = -1;
        int idx = 0;

        main.solution(max, idx);

    }
}
