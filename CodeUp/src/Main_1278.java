import java.util.Scanner;

public class Main_1278 {
    private int solution(int n) {
        return String.valueOf(n).length();
    }

    public static void main(String[] args) {
        Main_1278 main = new Main_1278();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.solution(n));
    }
}
