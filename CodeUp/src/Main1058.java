import java.util.Scanner;

public class Main1058 {  // [기초-논리연산] 둘 다 거짓일 경우만 참 출력하기
    private int solution(boolean a, boolean b) {
        if(!a && !b) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main1058 main = new Main1058();

        Scanner sc = new Scanner(System.in);
        boolean a = (sc.nextInt() == 1) ? true:false;
        boolean b = (sc.nextInt() == 1) ? true:false;
        
        int result = main.solution(a, b);
        System.out.println(result);
        sc.close();
    }
}
