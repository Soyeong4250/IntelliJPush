import java.util.Scanner;

public class Main_1034 {  // [기초-출력변환] 8진 정수 1개 입력받아 10진수로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine(), 8);
        System.out.println(num);
        sc.close();
    }
}
