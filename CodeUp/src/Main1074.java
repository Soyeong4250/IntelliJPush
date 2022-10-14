import java.util.Scanner;

public class Main1074 {  // [기초-반복실행구조] 정수 1개 입력받아 카운트다운 출력하기1
    private String solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.append(n + "\n");
            n--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main1074 main = new Main1074();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String result = main.solution(n);
        System.out.println(result);
        sc.close();
    }

}
