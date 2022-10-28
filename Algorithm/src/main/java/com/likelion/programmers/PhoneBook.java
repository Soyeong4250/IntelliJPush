package com.likelion.programmers;

import java.util.HashSet;

public class PhoneBook {
    private boolean solution(String[] phone_book) {
        /*
        1. 각 전화번호를 담아줄 HashSet 선언 👉 .contains() 메서드 사용위해
        2. 모든 전화번호를 HashSet에 담아주기
        3. 2중 for문을 통해 phone_book의 각 원소들을 비교하여
           하나의 원소가 다른 원소에 포함이 되어있는지 확인
         */
        HashSet<String> hash = new HashSet<>();

        for (int i = 0; i < phone_book.length; i++) {
            hash.add(phone_book[i]);
        }

        for (String num : phone_book) {
            for (int j = 1; j < num.length(); j++) {
                if(hash.contains(num.substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PhoneBook main = new PhoneBook();

        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(main.solution(phone_book));
    }
}
