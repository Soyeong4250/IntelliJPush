import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1079 {  // [기초-종합] 원하는 문자가 입력될 때까지 반복 출력하기
    private String solution(String str) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()) {
            String alphabet = st.nextToken();
            sb.append(alphabet + "\n");
            if(alphabet.equals("q")) {
               break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main1079 main = new Main1079();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = main.solution(str);
        System.out.println(result);
        sc.close();
    }

}
