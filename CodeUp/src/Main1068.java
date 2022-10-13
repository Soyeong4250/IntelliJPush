import java.util.Scanner;

class MyException extends Exception {
    // 0 ~ 100까지의 값만 유효한 값으로
    public MyException(String message) {
        super(message);
    }
}
public class Main1068 {  // [기초-조건/선택실행구조] 정수 1개 입력받아 평가 출력하기
    String result;
    private String solution(int score) {
        try {
            if(90<= score && score <=100) result = "A";
            else if(70 <= score && score < 90) result = "B";
            else if(40 <= score && score < 70) result = "C";
            else if(0 <= score && score < 40) result = "D";
            else throw new MyException("0~100 사이의 숫자만 입력해주세요.");
        }catch (MyException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        Main1068 main = new Main1068();
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        String result = main.solution(score);
        System.out.println(result);

        sc.close();
    }

}
