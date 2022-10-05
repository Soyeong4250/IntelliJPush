import java.util.Scanner;

public class Main_1019 {  // [기초-입출력] 연월일 입력받아 그대로 출력하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String[] date = Stream.of(sc.next().split("\\.")).mapToInt(Integer::parseInt).toArray();
        String[] date = sc.next().split("[.]");  // 정규식에서 . 은 임의의 한 문자이므로, [.] or \\.으로 작성
        sc.close();

        System.out.printf("%04d.%02d.%02d", Integer.valueOf(date[0]), Integer.valueOf(date[1]), Integer.valueOf(date[2]));
    }

}
