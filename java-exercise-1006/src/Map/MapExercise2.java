package Map;

import java.util.HashMap;
import java.util.Map;

public class MapExercise2 {
    public static void main(String[] args) {
        String s = "Welcome LikeLion2th";
        Map<Character, Integer> alphabetMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char alphabet = Character.toLowerCase(s.charAt(i));
            if (Character.isLetter(alphabet)) {  // 문자라면
                alphabetMap.put(alphabet, alphabetMap.getOrDefault(alphabet, 0) + 1);
            }
        }

        System.out.println("사용된 알파벳의 개수는 " + alphabetMap.size());
        System.out.println("각 알파벳의 개수는 다음과 같습니다.");
        System.out.println(alphabetMap);
    }
}
