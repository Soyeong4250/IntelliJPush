import java.util.Scanner;

public class Main1072 {  // [기초-반복실행구조] 정수 입력받아 계속 출력하기
    private String solution(Scanner sc, int t) {
        StringBuilder sb = new StringBuilder();
        while(t > 0) {
            int num = sc.nextInt();
            sb.append(num + "\n");
            t--;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main1072 main = new Main1072();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String result = main.solution(sc, t);
        System.out.println(result);
        sc.close();
    }

}
