import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1094 {  // [기초-1차원배열] 이상한 출석 번호 부르기2
    private String solution(String call) {
        String[] num = call.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = num.length-1; i >= 0; i--) {
            sb.append(num[i] + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        Main1094 main = new Main1094();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String call = br.readLine();
        String result = main.solution(call);
        System.out.println(result);
        br.close();
    }

}
