import java.util.Scanner;

public class Main1082 {  // 16진수 구구단?
    private void solution(int num) {
        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", num, i, num * i);
        }
    }

    public static void main(String[] args) {
        Main1082 main = new Main1082();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(16);
        main.solution(num);
        sc.close();
    }

}
