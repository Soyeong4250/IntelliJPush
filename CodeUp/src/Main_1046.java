import java.util.Scanner;

public class Main_1046 {  // [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long sum = a+b+c;
        float avg = (float)sum/3;

        System.out.println(sum);
        System.out.printf("%.1f\n", avg);

        sc.close();
    }
}
