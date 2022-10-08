import java.util.Scanner;

public class Main_1032 {  // [기초-출력변환] 10진 정수 입력받아 16진수로 출력하기1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(Integer.toHexString(num));
        sc.close();
    }
}