import java.util.Arrays;
import java.util.Scanner;

public class CoinTest {

    public static void main(String[] args) {
        // 현금으로 돈을 받고 25000원을 거슬러 주어야 합니다.
        // 각 화폐 단위별로 몇 장(개)을 거슬러주어야 할까요?
        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 넣으세요 : ");
        int coin = sc.nextInt();

        /*int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for (int i = 0; i < 6; i++) {
            System.out.printf("%d원 : %d개\n", unit[i], coin/unit[i]);
            coin %= unit[i];
        }*/

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;

        System.out.printf("50000원권 : %d장 나머지 : %d원\n", coin/curr50000, coin % curr50000);
        System.out.printf("10000원권 : %d장 나머지 : %d원\n", coin/curr10000, coin % curr10000);
        System.out.printf("5000원권 : %d장 나머지 : %d원\n", coin/curr5000, coin % curr5000);
        System.out.printf("1000원권 : %d장 나머지 : %d원\n", coin/curr1000, coin % curr1000);
        System.out.printf("500원 동전 : %d개 나머지 : %d원\n", coin/curr500, coin % curr500);
        System.out.printf("100원 동전 : %d개 나머지 : %d원\n", coin/curr100, coin % curr100);
    }

}
