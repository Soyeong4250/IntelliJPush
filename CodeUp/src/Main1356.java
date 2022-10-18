import java.util.Scanner;

public class Main1356 {  // 사각형 출력하기 2
    private void solution(int n) {
        for (int i = 0; i < n; i++) {
            if(i==0 || i==n-1) {
                System.out.println("*".repeat(n));
            }else {
                System.out.println("*" + " ".repeat(n-2) + "*");
            }
        }
    }

    public static void main(String[] args) {
        Main1356 main = new Main1356();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        main.solution(n);
        sc.close();
    }

}
