import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4037 {  // 소인수분해
    private String solution(int n, StringBuilder answer) {

        int divisor = 2;
        while(n > 1) {
            if(n % divisor == 0) {
                n /= divisor;
                answer.append(divisor).append(" ");
                if(n < divisor && n > 1) {
                    answer.append(n);
                    break;
                }
            }else {
                divisor++;
            }
        }
        return answer.toString();
    }

    private boolean isPrime(int divisor) {
        for (int i = 2; i <= Math.sqrt(divisor); i++) {
            if(divisor%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Main4037 main = new Main4037();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder answer = new StringBuilder();
        System.out.println(main.solution(n, answer));
    }
}
