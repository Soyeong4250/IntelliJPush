package Pojo;

import java.io.File;

public class FileExercise {
    public static void main(String[] args) {
        // 현재 디렉토리 파일 목록 출력
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }
}

/*
.\.idea
.\a_file.txt
.\java-exercise-1006.iml
.\out
.\src
*/
