import java.util.Scanner;

public class Main1090 {  // [기초-종합] 수 나열하기2
    private long solution(int a, int r, int n) {
        return (long)(a * Math.pow(r, n-1));
    }

    public static void main(String[] args) {
        Main1090 main = new Main1090();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        long result = main.solution(a, r, n);
        System.out.println(result);
        sc.close();
    }

}
