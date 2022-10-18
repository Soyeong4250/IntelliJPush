import java.util.Scanner;

public class Main1091 {  // [기초-종합] 수 나열하기3
    private long solution(int a, int m, int d, int n) {
        long result = (long)(a * Math.pow(m, n-1));
        for (int i = n - 2; i >= 0 ; i--) {
            result += (long)(d * Math.pow(m, i));
        }
        return result;
    }

    public static void main(String[] args) {
        Main1091 main = new Main1091();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        long result = main.solution(a, m, d, n);
        System.out.println(result);
        sc.close();
    }

}
