import java.util.Scanner;

public class Main1066 {  // [기초-조건/선택실행구조] 정수 3개 입력받아 짝/홀 출력하기
    private String solution(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append((arr[i] % 2 == 0) ? "even" : "odd");
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main1066 main = new Main1066();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = main.solution(new int[]{a, b, c});
        System.out.println(result);
        sc.close();
    }
}
