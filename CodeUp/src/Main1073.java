import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1073 {  // [기초-반복실행구조] 0 입력될 때까지 무한 출력하기2
    private String solution(String nums) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(nums);
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if(n == 0) {
                break;
            }else {
                sb.append(n + "\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main1073 main = new Main1073();

        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String result = main.solution(nums);
        System.out.println(result);
        sc.close();
    }

}
