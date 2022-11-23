import java.util.Scanner;

public class Main1620 {
    private int solution(int n) {
        int answer = 0;

        while(n / 10 > 0) {
            answer = 0;
            while (n > 0) {
                answer += n % 10;
                n /= 10;
            }
            n = answer;
        }

        return n;
    }

    public static void main(String[] args) {
        Main1620 main = new Main1620();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.solution(n));
    }
}
