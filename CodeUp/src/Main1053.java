import java.util.Scanner;

public class Main1053 {  // [기초-논리연산] 참 거짓 바꾸기
    private int solution(boolean n) {
        if(n) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Main1053 main = new Main1053();

        Scanner sc = new Scanner(System.in);
        boolean n = (sc.nextInt() == 1) ? true : false;
        int result = main.solution(n);
        System.out.println(result);
        sc.close();
    }
}
