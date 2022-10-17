import java.util.Scanner;

public class Main1086 {  // [기초-종합] 그림 파일 저장용량 계산하기
    private double solution(double w, double h, double b) {
        return (w * h * b) / 8 / Math.pow(1024, 2);
    }

    public static void main(String[] args) {
        Main1086 main = new Main1086();
        Scanner sc = new Scanner(System.in);

        double w = sc.nextInt();
        double h = sc.nextInt();
        double b = sc.nextInt();
        System.out.printf("%.2f MB", main.solution(w, h, b));
        sc.close();
    }

}
