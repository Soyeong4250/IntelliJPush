package com.line;

import com.line.parser.Parser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {
    // 2. 읽어올 Parser 인터페이스를 만들어보자!
    Parser<T> parser;
    boolean  isRemoveColumnName = true;

    public LineReader(Parser<T> parser) {
        this.parser = parser;
    }

    public LineReader(Parser<T> parser, boolean isRemoveColumnName) {
        this.parser = parser;
        this.isRemoveColumnName = isRemoveColumnName;
    }

    public List<T> readLines(String filename) throws IOException {
        List<T> result = new ArrayList<>();

//        BufferedReader br = new BufferedReader(new FileReader(filename));
        BufferedReader br;
        br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8);
        String str;
        String temp = br.readLine();  // 첫 한줄 (제목 행) 날리기
        System.out.println(temp);
        while((str = br.readLine()) != null) {
            result.add(parser.parse(str));
        }

        return result;
    }

}
