import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1071 {  // [기초-반복실행구조] 0 입력될 때까지 무한 출력하기1
    private String solution(String nums) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(nums);
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if(n==0) {
                break;
            }
            sb.append(n + "\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main1071 main = new Main1071();
        Scanner sc = new Scanner(System.in);

        String nums = sc.nextLine();
        String result = main.solution(nums);
        System.out.println(result);
        sc.close();
    }

}
