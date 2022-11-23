import java.util.Scanner;

public class Main1912 {  // (재귀함수) 팩토리얼 계산
    private long solution(int n) {
        if(n == 1) {
            return 1;
        }

        long sum = n * solution(n-1);
        return sum;
    }

    public static void main(String[] args) {
        Main1912 main = new Main1912();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(main.solution(n));
    }
}
