import java.util.Scanner;

public class Main1045 {  // [기초-산술연산] 정수 2개 입력받아 자동 계산하기

    public static void main(String[] args) {
        Main1045 m = new Main1045();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(m.plus(a, b));
        System.out.println(m.minus(a, b));
        System.out.println(m.multiple(a, b));
        System.out.println(m.divide(a, b));
        System.out.println(m.modulo(a, b));
        System.out.println(m.divide((float)a, (float)b));
    }

    private int plus(int a, int b) {
        return a+b;
    }

    private int minus(int a, int b) {
        return a-b;
    }

    private int multiple(int a, int b) {
        return a*b;
    }

    private int divide(int a, int b) {
        return a/b;
    }

    private int modulo(int a, int b) {
        return a%b;
    }

    private String divide(float a, float b) {
        return String.format("%.2f", a/b);
    }
}
