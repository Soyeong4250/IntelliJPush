import java.util.Scanner;

public class Main1061 {  // [기초-비트단위논리연산] 비트단위로 OR하여 출력하기
    private int solution(int a, int b) {
        return a|b;
    }

    public static void main(String[] args) {
        Main1061 main = new Main1061();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = main.solution(a, b);
        System.out.println(result);
        sc.close();
    }

}
