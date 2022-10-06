package Map;

import java.util.HashMap;

public class AlphabetCnt {

    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();
        String s1 = "aabbccddefghijkkkkkllm".toLowerCase();
        HashMap<Character, Integer> hash = new HashMap<>();

        for (int c = 'A'; c <= 'Z' ; c++) {
            hash.put(Character.toLowerCase((char)c), 0);
        }

        for(int i=0; i < s1.length(); i++) {
//          System.out.println(s1.charAt(i));
            char c = s1.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c);

            // 여기에서만 개수를 센다
            if(isAlphabet) {
                hash.put(c, hash.getOrDefault(c, 0)+1);
            }
        }


        System.out.println("사용된 알파벳의 개수는 " + hash.size());
        System.out.println("각 알파벳의 개수는 다음과 같습니다.");
        System.out.println(hash);

    }

    public boolean isAlphabet(char c) {
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        }
        return false;
    }
}
