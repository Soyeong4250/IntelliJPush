package com.springboot.hello.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {

    private Parser<T> parser;

    public ReadLineContext(Parser<T> parser) {
        this.parser = parser;
    }

    public List<T> readLineParser(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader( new FileReader(filename));

        String str;
        while((str = br.readLine())!=null) {
            result.add(parser.parse(str));
        }
        br.close();
        return result;
    }
}
