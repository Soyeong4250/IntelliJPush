import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2203 {  // 소인수구하기
    private Long solution(Long n) {
        Long maxDivisor = 0L;

        List<Long> divisor = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
          if(n % i == 0) {
              divisor.add((long)i);
              divisor.add((n/i));
                n /= i;
          }
        }

        System.out.println(divisor);
        int idx = divisor.size()-1;
        while(!divisor.isEmpty()) {
            Long factor = divisor.get(idx--);
            System.out.println(factor);
            if(isPrime(factor)) {
                maxDivisor = factor;
                break;
            }
        }

        return maxDivisor;
    }

    private boolean isPrime(Long factor) {
        for (int i = 2; i <= Math.sqrt(factor); i++) {
            if(factor % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Main2203 main = new Main2203();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(br.readLine());
        System.out.println(main.solution(n));
    }
}
