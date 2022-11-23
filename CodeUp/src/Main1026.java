import java.util.Scanner;

public class Main1026 {  // [기초-입출력] 시분초 입력받아 분만 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] time = sc.next().split(":");
        System.out.println(Integer.parseInt(time[1]));
        sc.close();
    }
}
