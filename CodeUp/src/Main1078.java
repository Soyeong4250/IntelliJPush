import java.util.Scanner;

public class Main1078 {  // [기초-종합] 짝수 합 구하기
    private int solution(int num) {
        int n = 1;
        int sum = 0;

        while(n <= num) {
            if(n%2 == 0) {
                sum += n;
            }
            n++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Main1078 main = new Main1078();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = main.solution(num);
        System.out.println(result);
        sc.close();
    }

}
