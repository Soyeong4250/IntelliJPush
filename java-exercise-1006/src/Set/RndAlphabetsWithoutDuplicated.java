package Set;

import java.util.HashSet;

public class RndAlphabetsWithoutDuplicated {

    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();
        HashSet<Character> hash = new HashSet<>();
        int cnt = 0;
        while (cnt < 30) {
            hash.add(randomAlphabetGenerator.create(0));
            cnt += 1;
        }

        System.out.println(hash);
        System.out.println(hash.size());
    }
    
}
