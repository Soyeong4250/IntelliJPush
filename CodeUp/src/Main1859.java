import java.util.Scanner;

public class Main1859 {  // [기초-재귀함수] 별 삼각형 출력하기
    private void solution(int start, int depth, int n) {
        if(start == n) {
            return;
        } else {
            if(start == depth) {
                start = 0;
                depth += 1;
                System.out.println();
            }
            System.out.print("*");
            solution(start+1, depth, n);
        }
    }

    public static void main(String[] args) {
        Main1859 recursiveStar = new Main1859();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursiveStar.solution(0,1, n);
        sc.close();
    }

}
