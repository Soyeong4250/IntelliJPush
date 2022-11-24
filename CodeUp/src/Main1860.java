import java.util.Scanner;

public class Main1860 { // [기초-재귀함수] 수 삼각형 출력하기
    private String getNums(int n) {
        if(n == 1) return "1";
        return getNums(n - 1) + " " + n;
    }
    private void solution(int n) {
        if(n == 0)  return;
        solution(n-1);
        System.out.println(getNums(n));
    }

    public static void main(String[] args) {
        Main1860 main = new Main1860();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        main.solution(n);
    }
}
