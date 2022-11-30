import java.util.Scanner;

public class Main1936 {  // (재귀함수) 두 노드간의 거리
    private static int solution(int a, int b) {
        if(a==b) return 0;
        else if(a < b) return solution(a, Math.floorDiv(b, 2)) + 1;
        else return solution(Math.floorDiv(a, 2), b) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a, b));
    }
}
