import java.util.Scanner;

public class Main1048 {  // [기초-비트시프트연산] 한 번에 2의 거듭제곱 배로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a<<b);

        sc.close();
    }
}
