import java.util.Scanner;

public class Main1015 {  // [기초-입출력] 실수 입력받아 둘째 자리 까지 출력하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        sc.close();
        System.out.printf("%.2f", Math.round(x *100)/100.0);
    }

}
