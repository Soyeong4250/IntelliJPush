import java.util.Scanner;

public class Main1083 {  // 3 6 9 게임의 왕이 되자!
    private String solution(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            if(i%3 == 0) {
                sb.append("X");
            }else {
                sb.append(i);
            }
            sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main1083 main = new Main1083();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String result = main.solution(num);
        System.out.println(result);
        sc.close();
    }

}
