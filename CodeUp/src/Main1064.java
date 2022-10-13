import java.util.Scanner;

public class Main1064 {  // [기초-삼항연산] 정수 3개 입력받아 가장 작은 수 출력하기
    private int solution(int a, int b, int c) {
        return ((a < b) ? a : b) < c ? ((a < b) ? a : b) : c;
    }

    public static void main(String[] args) {
        Main1064 main = new Main1064();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = main.solution(a, b, c);
        System.out.println(result);
        sc.close();
    }

}
