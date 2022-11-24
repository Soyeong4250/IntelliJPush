import java.util.Scanner;

public class Main1856 {  // [기초-재귀함수] 계단 뛰어 오르기
    private int solution(int step, int sum, String answer) {
        int result = 0;
        if(sum == step) {
//            System.out.println(answer);  // 어떤 수가 더해졌는지 확인
            return 1;
        }else if(step < sum){
            return 0;
        }

        result += solution(step, sum + 1, answer + "1");
        result += solution(step, sum + 2, answer + "2");
        result += solution(step, sum + 3, answer + "3");
        return result;
    }

    public static void main(String[] args) {
        Main1856 main = new Main1856();
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();
        System.out.println(main.solution(step, 0, ""));
    }
}
