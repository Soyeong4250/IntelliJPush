import java.util.Scanner;

public class Main1041 {  // [기초-산술연산] 문자 1개 입력받아 다음 문자 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch = sc.next().charAt(0);
        System.out.println((char)(ch+1));
        sc.close();
    }
}
