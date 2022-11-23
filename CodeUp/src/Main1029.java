import java.util.Scanner;

public class Main1029 {  // [기초-데이터형] 실수 1개 입력받아 그대로 출력하기2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        System.out.printf("%.11f", num);
        sc.close();
    }
}
