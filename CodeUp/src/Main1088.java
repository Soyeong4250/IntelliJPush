import java.util.Scanner;

public class Main1088 {  // [기초-종합] 3의 배수는 통과?
    private void solution(int num) {
        for (int i = 1; i <= num; i++) {
            if(i%3==0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main1088 main = new Main1088();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        main.solution(num);
    }

}
