import java.util.Scanner;

public class Main1092 { // [기초-종합] 함께 문제 푸는 날
    private int solution(int a, int b, int c) {
        return lcm(lcm(a,b), c);
    }

    private int lcm(int a, int b) {
        int small = Math.min(a, b);
        int big = Math.max(a, b);

        while(small != 0) {
            int r = big%small;
            big = small;
            small = r;
        }

        return (a*b)/big;
    }

    public static void main(String[] args) {
        Main1092 main = new Main1092();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = main.solution(a, b, c);
        System.out.println(result);
        sc.close();
    }

}
