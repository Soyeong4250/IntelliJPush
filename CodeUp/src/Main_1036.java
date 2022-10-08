import java.util.Scanner;

public class Main_1036 {  // [기초-출력변환] 영문자 1개 입력받아 10진수로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println((int)sc.next().charAt(0));
        sc.close();
    }
}
