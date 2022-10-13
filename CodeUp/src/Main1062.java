import java.util.Scanner;

public class Main1062 {  // [기초-비트단위논리연산] 비트단위로 XOR하여 출력하기
    private int solution(int a, int b) {
        return a ^ b;
    }

    public static void main(String[] args) {
        Main1062 main = new Main1062();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = main.solution(a, b);
        System.out.println(result);
        sc.close();
    }

}
