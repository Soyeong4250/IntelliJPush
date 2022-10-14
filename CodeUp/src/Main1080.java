import java.util.Scanner;

public class Main1080 {  // [기초-종합] 언제까지 더해야 할까?
    private int solution(int num) {
        int sum = 0;
        int n = 0;

        while(sum < num) {
            n++;
            sum += n;
        }

        return n;
    }

    public static void main(String[] args) {
        Main1080 main = new Main1080();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = main.solution(num);
        System.out.println(result);
        sc.close();
    }

}
