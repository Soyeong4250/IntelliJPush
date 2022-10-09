import java.util.Scanner;

public class Main_1042 {  // [기초-산술연산] 정수 2개 입력받아 나눈 몫 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a/b);
        sc.close();
    }
}
