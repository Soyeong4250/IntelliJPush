import java.util.Scanner;

public class Main_1035 {  // [기초-출력변환] 16진 정수 1개 입력받아 8진수로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.next(),16);
        System.out.println(Integer.toOctalString(num));
        sc.close();
    }
}
