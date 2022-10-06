import java.util.Scanner;

public class Main_1027 {  // [기초-입출력] 년월일 입력 받아 형식 바꿔 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] date = sc.nextLine().split("\\.");
        System.out.printf("%s-%s-%s\n", date[2], date[1], date[0]);

        sc.close();
    }
}
