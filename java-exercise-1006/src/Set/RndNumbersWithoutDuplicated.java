package Set;

import java.util.LinkedHashSet;

public class RndNumbersWithoutDuplicated {

    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();  // 입력 순서대로 데이터 관리
        for (int i = 0; i < 50; i++) {

            int r = randomNumberGenerator.generate(10);  // 10미만의 랜덤한 숫자 생성
            // System.out.println(r);

            linkedHashSet.add(r);
        }

        System.out.println(linkedHashSet);
    }

}
