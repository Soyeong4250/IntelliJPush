package Practice;

public class SomOfDigit {
    private int solution(int n) {

        int answer = 0;
        while(n > 0) {
            answer += n%10;
            n /= 10;
        }

        return answer;
    }

    /*private int solution(int n) {
        // n을 String으로 변경
        String str = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        // String을 loop 돌면서 parseInt 후 더함
        return result;
    }*/

    public static void main(String[] args) {
        SomOfDigit sod = new SomOfDigit();
        int result = sod.solution(1234);

        if (result == 10) {
            System.out.println("테스트 통과");
        } else {
            System.out.printf("테스트 실패 result : %d \n", result);
        }
    }
}