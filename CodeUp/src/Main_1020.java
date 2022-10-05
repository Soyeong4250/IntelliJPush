import java.util.Scanner;

public class Main_1020 {  // [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String[] rNumber = sc.next().split("-");
        sc.close();

        System.out.println(rNumber[0] + rNumber[1]);
    }

}
