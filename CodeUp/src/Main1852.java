import java.util.Scanner;

public class Main1852 {  // [기초-재귀함수] 재귀로 1부터 n까지 한 줄로 출력하기
    private StringBuilder solution(int n, int idx) {
        StringBuilder answer = new StringBuilder();
        if(idx == n){
            return answer.append(idx).append(" ");
        }

        return answer.append(idx).append(" ").append(solution(n, idx+1));
    }
    private void solution2(int n, int idx) {
        if(idx == n) {
            System.out.println(idx);
            return;
        }
        System.out.print(idx + " ");
        solution2(n, idx+1);
    }

    public static void main(String[] args) {
        Main1852 main = new Main1852();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(main.solution(n, 1));
        main.solution2(n, 1);
    }

}
