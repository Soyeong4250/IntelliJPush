package com.line;

import com.line.parser.Parser;

import java.io.*;
import java.util.List;

public class FileWriter<T> {
    // 14. 파일 생성
    public void createSqlFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
            System.out.println("Hava a file generated?" + file.exists());
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 15. 생성한 SQL문을 파일에 작성하는 메서드를 구현 👉 Main으로 이동
    // 파일에 SQL문 작성 (List)
//    public void writeLines(List<String> queries, String filename) {
//        File file = new File(filename);
//
//        try {
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF8"));
//            for (String query: queries) {
//                writer.write(query);
//            }
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    // 파일에 Sql문 작성 (String)
    public void writeLines(String queries, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF8"));
            writer.write(queries);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
