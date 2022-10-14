import java.util.Scanner;

public class Main1076 {  // [기초-반복실행구조] 문자 1개 입력받아 알파벳 출력하기
    private String solution(char alphabet) {
        StringBuilder sb = new StringBuilder();
        char ch = 'a';
        while(ch <= alphabet) {
            sb.append(ch + "\n");
            ch++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main1076 main = new Main1076();
        Scanner sc = new Scanner(System.in);

        char alphabet = sc.nextLine().charAt(0);
        String result = main.solution(alphabet);
        System.out.println(result);
        sc.close();
    }

}
