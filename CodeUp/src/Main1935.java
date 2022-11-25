import java.util.Scanner;

public class Main1935 {  // (재귀함수) LCA
    private int solution(int a, int b) {
        System.out.println(a + ", " + b);
        if(a == b) {
            return a;
        }

        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        return solution(a, b/=2);
    }

    public static void main(String[] args) {
        Main1935 main = new Main1935();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(main.solution(a, b));
    }
}
