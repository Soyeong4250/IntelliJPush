package Pojo;

import java.io.FileReader;
import java.io.IOException;

public class FileExercise2 {
    private String filename;

    public FileExercise2(String filename) {
        this.filename = filename;
    }

    public String readNChars (int N) throws IOException {
        FileReader fileReader = new FileReader(this.filename);
        String str = "";
        for (int i = 0; i < N; i++) {
            // - 가 나올 경우 break
            int asciiCode = fileReader.read();
            if(asciiCode == -1) {
                return str;
            }
            str += (char) fileReader.read();
        }
        return str;
    }

    public static void main(String[] args) throws IOException {
        FileExercise2 fileExercise = new FileExercise2("./src/Pojo/a_file.txt");
        String str = fileExercise.readNChars(5);
        System.out.println("N 글자 출력");
        System.out.println(str);

    }
}