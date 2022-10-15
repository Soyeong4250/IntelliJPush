package com.line.parser;

public interface Parser<T> {
    // 3. 다형성을 위해 Generic을 T로 설정하고 parse() 기능 선언
    // 👉 병원데이터를 읽을거니까 HospitalParser객체를 생성하여 구현하자
    T parse(String str);
}
