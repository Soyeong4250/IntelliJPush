import java.util.Scanner;

public class Main1854 {
    private long solution(long num) {
        long sum = 0;
        if(num/10 == 0) {
            return (int)(num%10);
        }

        sum += num%10 + solution(num/10);
        return sum;
    }

    public static void main(String[] args) {
        Main1854 main = new Main1854();
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(main.solution(num));
    }

}
