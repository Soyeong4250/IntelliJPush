import java.util.Scanner;

public class Main1011 {  // [기초-입출력] 문자 1개 입력받아 그대로 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();
        System.out.println(ch);

    }

}
