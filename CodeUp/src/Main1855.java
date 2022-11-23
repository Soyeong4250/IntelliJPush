import java.util.Scanner;

public class Main1855 {  // [기초-재귀함수] 재귀로 n번째 피보나치 수 리턴하기
    public static void main(String[] args) {
        Main1855 main = new Main1855();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.fibo(n));
    }

    private long fibo(int n) {
        if(n < 2) {
            return n;
        }

        long result = fibo(n-1) + fibo(n-2);
        return result;
    }
}
