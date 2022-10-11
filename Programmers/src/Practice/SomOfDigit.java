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