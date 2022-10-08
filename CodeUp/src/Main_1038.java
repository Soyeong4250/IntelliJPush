import java.util.Scanner;

public class Main_1038 {  // [기초-산술연산] 정수 2개 입력받아 합 출력하기1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long first = sc.nextInt();
        long second = sc.nextInt();

        System.out.println(first + second);
        sc.close();
    }
}
