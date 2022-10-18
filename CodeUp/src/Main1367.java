import java.util.Scanner;

public class Main1367 {  // 평행사변형 출력하기 1
    private void solution(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Main1367 main = new Main1367();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        main.solution(n);
        sc.close();
    }

}
