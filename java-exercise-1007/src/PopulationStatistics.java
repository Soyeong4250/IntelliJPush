import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {
    public void readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String fileContents = "";
        while(fileContents.length() < 1_000_000) {
            fileContents += (char) fileReader.read();
        }
        System.out.println(fileContents);
    }

    public void readByLine(String filename) throws IOException {
        // 파일 내용을 삽으로 푸듯이 크게 (한 줄씩) 읽어오기
        // 시도 1 : 공간 복잡도가 늘어남
        /*FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);*/

        // 시도 1 Refactoring
        BufferedReader reader = new BufferedReader(new FileReader(filename));


        String str;

        while((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }

    public void readByLine2(String filename) {
        // 에러를 tyr catch로 안에서 처리
        // Files.newBufferedReader() 모던한 스타일
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 3-1. PopulationMove - parse() 메서드 구현
    public  PopulationMove parse(String data) {
        String[] input = data.split(",");
        return new PopulationMove(input[0], input[6]);  // 전입, 전출 순서
    }


}
