import java.util.Scanner;
public class Main1070 {  // [기초-조건/선택실행구조] 월 입력받아 계절 출력하기
    private String solution(int month) {
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            default:
                season = "fall";
                break;
        }
        return season;
    }

    public static void main(String[] args) {
        Main1070 main = new Main1070();
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        String result = main.solution(month);
        System.out.println(result);
        sc.close();
    }

}
