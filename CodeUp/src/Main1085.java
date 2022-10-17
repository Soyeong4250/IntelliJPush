import java.io.*;
import java.util.StringTokenizer;

public class Main1085 {  // [기초-종합] 소리 파일 저장용량 계산하기
    private double solution(double h, double b, double c, double s) {
        return (h * b * c * s) / 8 / Math.pow(1024, 2);
    }

    public static void main(String[] args) throws IOException {
        Main1085 main = new Main1085();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double h = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double c = Integer.parseInt(st.nextToken());
        double s = Integer.parseInt(st.nextToken());
        br.close();

        double result = main.solution(h, b, c, s);
        System.out.printf("%.1f MB\n", result);
    }

}
