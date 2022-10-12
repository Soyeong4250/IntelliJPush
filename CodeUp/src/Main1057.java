import java.util.Scanner;

public class Main1057 {  // [기초-논리연산] 참/거짓이 서로 같을 때에만 참 출력하기
    private int solution(boolean a, boolean b) {
        if(a == b) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main1057 main = new Main1057();

        Scanner sc = new Scanner(System.in);
        boolean a = (sc.nextInt() == 1) ? true : false;
        boolean b = (sc.nextInt() == 1) ? true : false;

        int result = main.solution(a, b);
        System.out.println(result);
        sc.close();
    }
}
