import java.util.Scanner;

public class Main_1047 {  // [기초-비트시프트연산] 정수 1개 입력받아 2배 곱해 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n<<1);
        sc.close();
    }
}
