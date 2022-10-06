package Pojo;

import java.io.File;

public class FileExercise {
    public static void main(String[] args) {
        // 상위 디렉토리 파일 목록 출력
        File dir = new File("../");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }
}


/*
상위 디렉토리의 파일 목록 출력
..\.git
..\CodeUp
..\java-exercise-1004
..\java-exercise-1005
..\java-exercise-1006
*/
