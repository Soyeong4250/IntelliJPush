package Set;

import java.util.HashSet;

public class RndAlphabetsWithoutDuplicated {

    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();
        HashSet<Character> hash = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            char alphabet = randomAlphabetGenerator.create();
            hash.add(alphabet);
        }

        System.out.println(hash);
    }
    
}
