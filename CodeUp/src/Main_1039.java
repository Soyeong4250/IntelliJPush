import java.util.Scanner;

public class Main_1039 {  // [기초-산술연산] 정수 2개 입력받아 합 출력하기2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long first = sc.nextLong();
        long second = sc.nextLong();
        long answer = first + second;
        System.out.println(answer);
        sc.close();
    }
}
