import java.util.Scanner;

public class Main_1044 {  // [기초-산술연산] 정수 1개 입력받아 1 더해 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long a = sc.nextLong();
        System.out.println(++a);
        sc.close();
    }
}
