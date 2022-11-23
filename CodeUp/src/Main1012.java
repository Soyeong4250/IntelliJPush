import java.util.Scanner;

public class Main1012 {  // [기초-입출력] 실수 1개 입력받아 그대로 출력하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        sc.close();
        System.out.printf("%f", x);
    }

}
