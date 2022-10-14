import java.util.Scanner;

public class Main1077 {  // [기초-반복실행구조] 정수 1개 입력받아 그 수까지 출력하기
    private String solution(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= num; i++) {
            sb.append(i + "\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main1077 main = new Main1077();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String result = main.solution(num);
        System.out.println(result);
        sc.close();
    }

}
