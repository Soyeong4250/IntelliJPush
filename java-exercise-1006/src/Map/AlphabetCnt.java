package Map;

import java.util.HashMap;

public class AlphabetCnt {

    public static void main(String[] args) {
        String s1 = "aabbccddefghijkkkkkllm";
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i=0; i < s1.length(); i++) {
//          System.out.println(s1.charAt(i));
            char ch = s1.charAt(i);
            if(isAlphabet(ch)) {
                hash.put(ch, hash.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("사용된 알파벳의 개수는 " + hash.size());
        System.out.println("각 알파벳의 개수는 다음과 같습니다.");
        System.out.println(hash);

    }

    public static boolean isAlphabet(char c) {
        if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            return true;
        }
        return false;
    }
}
