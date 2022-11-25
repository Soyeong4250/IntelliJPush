import java.util.Scanner;

public class Main2623 {  // 최대공약수 구하기
    private int gcd(int a, int b) {
        if(a == b) return a;
        else if(a < b) return gcd(a, b - a);
        else if(a > b) return gcd(a - b, b);
        return 1;
    }

    private int gcd2(int a, int b) {
        while (a > 0 && b > 0 && a != b) {
            if(a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            // System.out.println(a +", " + b);
            b -= a;
        }

        if(b <= 0) return 1;
        return a;
    }

    public static void main(String[] args) {
        Main2623 main = new Main2623();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(main.gcd(a, b));
        System.out.println(main.gcd2(a, b));
    }
}
