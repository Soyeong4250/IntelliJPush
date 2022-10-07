import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    public void readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String fileContents = "";
        while(fileContents.length() < 1_000_000) {
            fileContents += (char) fileReader.read();
        }
        System.out.println(fileContents);
    }

    public List<PopulationMove> readByLine(String filename) throws IOException {
        // 파일 내용을 삽으로 푸듯이 크게 (한 줄씩) 읽어오기
        // 시도 1 : 공간 복잡도가 늘어남
        /*FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);*/

        // 시도 1 Refactoring
        List<PopulationMove> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String str;

        while((str = reader.readLine()) != null) {
            // System.out.println(str);
            // PopulationMove pm = parse(str);
            result.add(parse(str));
        }
        reader.close();
        return result;
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
    public PopulationMove parse(String data) {
        String[] input = data.split(",");
        // 이전 파일
        //return new PopulationMove(input[0], input[6]);  // 전입, 전출 순서

        // 새로운 파일
        return new PopulationMove(input[0], input[1]);  // 전입, 전출
    }

    // 4. 필요한 데이터만 추출하여 파일로 만들기
    // 4-1. 파일을 생성하는 메소드
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // 4-2. 파일에 내용을 작성하는 메소드
    public void write(List<String> strs, String filename) {
        File file = new File(filename);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // 4-3. PopulationMove 객체의 데이터들을 String 형태로 변환하기
    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," +populationMove.getFromSido() + "\n";
    }


}
