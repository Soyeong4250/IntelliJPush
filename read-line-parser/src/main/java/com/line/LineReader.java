package com.line;

import com.line.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {
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

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        br.readLine();  // 첫 한줄 (제목 행) 날리기
        while((str = br.readLine()) != null) {
            result.add(parser.parse(str));
        }

        return result;
    }

}
