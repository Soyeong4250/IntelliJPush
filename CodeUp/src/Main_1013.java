import java.util.Scanner;

public class Main_1013 {  // [기초-입출력] 정수 2개 입력받아 그대로 출력하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(a + " " + b);
    }

}
