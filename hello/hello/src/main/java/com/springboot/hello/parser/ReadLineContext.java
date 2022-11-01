package com.springboot.hello.parser;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {

    private Parser<T> parser;

    public ReadLineContext(Parser<T> parser) {
        this.parser = parser;
    }

    public List<T> readLineParser(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        // BufferedReader br = new BufferedReader(new FileReader(filename));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "euc-kr"));
        String str;
        String temp = br.readLine();  // 첫 한줄 (제목 행) 날리기
        System.out.println(temp);
        while((str = br.readLine()) != null) {
            System.out.printf("%s \n", str);
            try {
                result.add(parser.parse(str));
                System.out.println("성공");
            }catch (Exception e) {
                System.out.printf("파싱 중 문제발생! 파일내용: %s\n", str.substring(0, 20));
            }
        }
        br.close();
        return result;
    }
}
