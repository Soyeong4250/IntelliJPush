import java.util.Scanner;

public class Main1037 {  // [기초-출력변환] 정수 입력받아 아스키 문자로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println((char)sc.nextInt());
        sc.close();
    }
}
