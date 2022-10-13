import java.util.Scanner;

public class Main1063 {  // [기초-삼항연산] 두 정수 입력받아 큰 수 출력하기
    private int solution(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Main1063 main =  new Main1063();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = main.solution(a, b);
        System.out.println(result);
        sc.close();
    }

}
