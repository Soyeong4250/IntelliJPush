import java.util.Scanner;

public class Main1067 {  // [기초-조건/선택실행구조] 정수 1개 입력받아 분석하기
    private String solution(int n) {
        StringBuilder sb = new StringBuilder();
        if(n < 0) {
            sb.append("minus");
        }else {
            sb.append("plus");
        }

        sb.append("\n");

        if(n%2 == 0) {
            sb.append("even");
        }else {
            sb.append("odd");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main1067 main = new Main1067();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String result = main.solution(n);
        System.out.println(result);
        sc.close();
    }

}
