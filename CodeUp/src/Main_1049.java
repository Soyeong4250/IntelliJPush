import java.util.Scanner;

public class Main_1049 { // [기초-비교연산] 두 정수 입력받아 비교하기1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
