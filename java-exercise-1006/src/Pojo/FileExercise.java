package Pojo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {
    public void printFiles() {
        // 상위 디렉토리 파일 목록 출력
        File dir = new File("../");
        File[] files = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }

    public char readAChar (String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    public String readChars (String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }

    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("./src/Pojo/a_file.txt");
        System.out.println("한 글자 출력");
        System.out.println(c);

        String str = fileExercise.readChars("./src/Pojo/a_file.txt");
        System.out.println("두 글자 출력");
        System.out.println(str);
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
