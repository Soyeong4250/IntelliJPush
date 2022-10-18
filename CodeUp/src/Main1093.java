import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1093 {  // [기초-2차원배열] 이상한 출석 번호 부르기1
    private void solution(int n, String call, int[] students) {
        StringTokenizer st = new StringTokenizer(call);
        for (int i = 0; i < n; i++) {
            students[Integer.parseInt(st.nextToken())-1]++;
        }
        
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%d ", students[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        Main1093 main = new Main1093();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String call = br.readLine();
        int[] students = new int[23];

        main.solution(n, call, students);
        br.close();
    }

}
