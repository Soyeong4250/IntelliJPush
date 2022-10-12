import java.util.Scanner;

public class Main1052 {  // [기초-비교연산] 두 정수 입력받아 비교하기4
    private int solution(int a, int b) {
        if(a != b) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main1052 main = new Main1052();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = main.solution(a, b);
        System.out.println(result);
        sc.close();
    }
}
