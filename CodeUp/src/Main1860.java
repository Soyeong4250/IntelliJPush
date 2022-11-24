import java.util.Scanner;

public class Main1860 { // [기초-재귀함수] 수 삼각형 출력하기
    private void solution(int n, int depth, int num) {
        if(num == depth) {
            System.out.println(num);
            solution(n, depth+1, 1);
            return;
        }

        if(depth > n) {
            return;
        }

        System.out.print(num + " ");
        solution(n, depth, num+1);
    }

    public static void main(String[] args) {
        Main1860 main = new Main1860();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        main.solution(n, 1, 1);
    }
}
