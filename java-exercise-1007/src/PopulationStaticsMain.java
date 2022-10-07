import java.io.IOException;

public class PopulationStaticsMain {
    public static void main(String[] args) throws IOException {
        PopulationStatistics populationStatistics = new PopulationStatistics();

        // 1. 파일 읽어오기
        // 파일을 읽기 위한 준비
        String path = "C:\\TECHIT\\git\\data\\2021_인구관련연간자료.csv";

        // 파일 읽기 (한 글자씩 총 100만 글자)
        populationStatistics.readAChar(path);

        // 파일 읽기 (한 줄씩 읽기)
        populationStatistics.readByLine(path);

        // 자바 8 스타일로 한 줄씩 읽기
        populationStatistics.readByLine2(path);

        /*String data = ""
        PopulationMove pm = populationStatistics.parse(data);
        System.out.println(pm.getFromSido());
        System.out.println(pm.getToSido());*/
    }
}
