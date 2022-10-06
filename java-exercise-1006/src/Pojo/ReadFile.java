package Pojo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        char c = readFile.readAByte("./a_file.txt");
        System.out.println(c);
    }

    public char readAByte(String fileName) {
        char ch = ' ';
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            ch = br.readLine().charAt(0);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("읽어올 파일이 없습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ch;
    }

}
