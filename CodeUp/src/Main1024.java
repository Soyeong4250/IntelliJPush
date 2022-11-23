import java.util.Scanner;

public class Main1024 {  // [기초-입출력] 단어 1개 입력받아 나누어 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            System.out.println("\'" + word.charAt(i) + "\'");
        }
        sc.close();
    }
}
