import java.util.Scanner;

public class Main_1025 {  // [기초-입출력] 정수 1개 입력받아 나누어 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 4; i >= 0; i--) {
            int div = (int)Math.pow(10, i);
            System.out.println("[" + num/div * div + "]");
            num %= div;
        }
        sc.close();
    }
}
