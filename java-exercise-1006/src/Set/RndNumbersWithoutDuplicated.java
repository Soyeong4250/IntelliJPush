package Set;

import java.util.HashSet;

public class RndNumbersWithoutDuplicated {

    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);  // 10미만의 랜덤한 숫자 생성
            // System.out.println(r);

            hash.add(r);
        }

        System.out.println(hash);
    }

}
