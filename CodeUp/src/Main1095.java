import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1095 {  // [기초-1차원배열] 이상한 출석 번호 부르기3
    private int solution(String call) {
        int min = 24;
        StringTokenizer st = new StringTokenizer(call);
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(min > num) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        Main1095 main = new Main1095();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String call = br.readLine();
        int result = main.solution(call);
        System.out.println(result);
        br.close();
    }

}
