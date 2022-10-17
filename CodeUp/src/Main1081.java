import java.util.Scanner;

public class Main1081 {  // [기초-종합] 주사위를 2개 던지면?
    private void solution(int first, int second) {
        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }

    public static void main(String[] args) {
        Main1081 main = new Main1081();
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        main.solution(first, second);
        sc.close();
    }

}
