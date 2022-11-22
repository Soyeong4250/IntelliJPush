import java.util.Scanner;

public class Main1851 {
    private String solution(int n, String result) {
        if(n == 0) {
            return "*";
        }

        result += solution(n-1, "*");
        return result;
    }
    
    public static void main(String[] args) {
        Main1851 main = new Main1851();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(main.solution(n, ""));
    }

}
