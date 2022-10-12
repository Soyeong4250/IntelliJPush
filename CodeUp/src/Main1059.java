import java.util.Scanner;

public class Main1059 {  // [기초-비트단위논리연산] 비트단위로 NOT하여 출력하기
    private int solution(int n) {
        int num = ~n;

        return num;
    }

    public static void main(String[] args) {
        Main1059 main = new Main1059();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = main.solution(n);
        System.out.println(result);
        sc.close();
    }

}
