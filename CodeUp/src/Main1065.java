import java.util.Scanner;

public class Main1065 {  // [기초-조건/선택실행구조]
    private String solution(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();

        if(a%2==0) {
            sb.append(a + "\n");
        }
        if(b%2==0) {
            sb.append(b + "\n");
        }

        if(c%2==0) {
            sb.append(c + "\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main1065 main = new Main1065();
        Scanner sc =  new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = main.solution(a, b, c);
        System.out.println(result);
        sc.close();
    }

}
