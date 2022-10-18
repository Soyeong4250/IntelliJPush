import java.util.Scanner;

public class Main1356 {  // 사각형 출력하기 2
    private void solution(int n) {
        for (int i = 0; i < n; i++) {
            if(i==0 || i==n-1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }else {
                System.out.print("*");
                for (int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
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
