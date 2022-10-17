import java.util.Scanner;

public class Main1087 {  // [기초-종합] 여기까지! 이제 그만~
    private int solution(int num) {
        int sum = 0;
        int i = 1;
        while(sum < num) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Main1087 main = new Main1087();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = main.solution(num);
        System.out.println(result);
        sc.close();
    }

}
