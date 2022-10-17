import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *           i = 0 별이 1개
        * *         i = 1 별이 2개
        * * *       i = 2 별이 3개
        * * * *     i = 3 별이 4개
         */

        // for문을 한개 더 사용하여
        // println 말고 print, printf 등을 써서 한 줄로 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            } System.out.println();
        }
    }
}