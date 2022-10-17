import java.util.Scanner;

public class Main1089 {  // [기초-종합] 수 나열하기1
    private int solution(int a, int d, int n) {
        return a + d * (n - 1);
    }

    public static void main(String[] args) {
        Main1089 main = new Main1089();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int result = main.solution(a, d, n);
        System.out.println(result);
    }

}
