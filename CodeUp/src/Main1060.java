import java.util.Scanner;

public class Main1060 {  // [기초-비트단위논리연산] 비트단위로 AND하여 출력하기
    private int solution(int a, int b) {
        return a & b;
    }

    public static void main(String[] args) {
        Main1060 main = new Main1060();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = main.solution(a, b);
        System.out.println(result);
        sc.close();
    }

}
