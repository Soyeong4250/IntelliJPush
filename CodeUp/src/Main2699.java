import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2699 {  // 사투리
    private int solution(String str1, String str2) {
        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                dp[i][j] = (str2.charAt(i-1) == str1.charAt(j-1)) ? dp[i-1][j-1]+1 : Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[str2.length()][str1.length()];
    }

    public static void main(String[] args) throws IOException {
        Main2699 main = new Main2699();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(main.solution(str1, str2));
    }
}
