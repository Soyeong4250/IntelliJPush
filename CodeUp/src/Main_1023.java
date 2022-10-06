import java.util.Scanner;

public class Main_1023 {  // [기초-입출력] 실수 1개 입력받아 부분별로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        String[] arr = num.split("\\.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
