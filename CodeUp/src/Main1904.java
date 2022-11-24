import java.util.Scanner;

public class Main1904 {  // (재귀함수) 두 수 사이의 홀수 출력하기
    private StringBuilder solution(int a, int b) {
        StringBuilder answer = new StringBuilder();
        if(a == b) {
            return a % 2 == 1 ? answer.append(a) : answer;
        }

        if(a%2 == 1) {
            answer.append(a).append(" ");
        }
        answer.append(solution(a+1, b));

        return answer;
    }

    private void solution2(int a, int b) {
        if(a == b) {
            if(a % 2 == 1) System.out.println(a);
            return;
        }

        if(a%2 == 1) {
            System.out.print(a + " ");
        }
        solution2(a+1, b);
    }

    public static void main(String[] args) {
        Main1904 main = new Main1904();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(main.solution(a, b));
        main.solution2(a, b);
    }
}
