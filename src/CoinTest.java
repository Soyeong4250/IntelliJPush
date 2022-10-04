import java.util.Arrays;
import java.util.Scanner;

public class CoinTest {

    public static void main(String[] args) {
        // 현금으로 돈을 받고 25000원을 거슬러 주어야 합니다.
        // 각 화폐 단위별로 몇 장(개)을 거슬러주어야 할까요?
        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 넣으세요 : ");
        int coin = sc.nextInt();

        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int[] cnt = new int[8];

        for (int i = 0; i < unit.length; i++) {
            cnt[i] = coin/unit[i];
            coin %= unit[i];
        }

        for (int i = 0; i < unit.length; i++) {
            if(cnt[i] > 0) {
                System.out.println(unit[i] + "원은 " + cnt[i] + "장(개) 입니다.");
            }
        }
    }

}
