import java.util.Scanner;

public class Main1033 {  // [기초-출력변화] 10진 정수 입력받아 16진수로 출력하기2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Integer.toHexString(sc.nextInt()).toUpperCase());
        sc.close();
    }
}
