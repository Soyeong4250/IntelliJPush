package Pojo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

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
            str += (char)asciiCode;
        }
        return str;
    }

    public String readALine() throws IOException {
        FileReader fileReader = new FileReader(this.filename);
        BufferedReader br = new BufferedReader(fileReader);
        String str = br.readLine();

        return str;
    }

    public void readAllLine() {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(this.filename), StandardCharsets.UTF_8)) {

            System.out.println("전체 문장 출력");
            String str = "";
            while(br.readLine() != null) {
                str += br.readLine();
            }
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        FileExercise2 fileExercise = new FileExercise2("./src/Pojo/a_file.txt");
        /*String str = fileExercise.readNChars(5);
        System.out.println("N 글자 출력");
        System.out.println(str);

        String str1 = fileExercise.readALine();
        System.out.println("한 개의 Line 출력");
        System.out.println(str1);*/

        fileExercise.readAllLine();

    }
}