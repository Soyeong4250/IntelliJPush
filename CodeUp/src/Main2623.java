import java.util.Scanner;

public class Main2623 {  // 최대공약수 구하기
    private int gcd(int a, int b) {
        if(a == b) return a;
        else if(a < b) return gcd(a, b - a);
        else if(a > b) return gcd(a - b, b);
        return 1;
    }

    public static void main(String[] args) {
        Main2623 main = new Main2623();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(main.gcd(a, b));
    }
}
