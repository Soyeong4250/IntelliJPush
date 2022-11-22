import java.util.Scanner;

public class Main1853 {
    private int solution(int n) {
        if(n == 0) {
            return n;
        }

        int result = 0;
        result = n + solution(n-1);
        return result;
    }

    public static void main(String[] args) {
        Main1853 main = new Main1853();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.solution(n));
    }

}
