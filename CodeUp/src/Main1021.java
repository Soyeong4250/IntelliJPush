import java.util.Scanner;

public class Main1021 {  // [기초-입출력] 단어 1개 입력받아 그대로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        System.out.println(word);

        sc.close();
    }
}
