import java.util.Scanner;

public class Main1051 {  // [기초-비교연산] 두 정수 입력받아 비교하기3
    private int solution(int a, int b) {
        if(a <= b) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main1051 main = new Main1051();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = main.solution(a, b);
        System.out.println(result);
        sc.close();
    }
}
