import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PopulationStaticsMain {
    public static void main(String[] args) throws IOException {
        PopulationStatistics populationStatistics = new PopulationStatistics();

        // 1. 파일 읽어오기
        // 파일을 읽기 위한 준비
        //String path = "C:\\TECHIT\\git\\data\\2021_인구관련연간자료.csv";

        // 파일 읽기 (한 글자씩 총 100만 글자)
        /*populationStatistics.readAChar(path);

        // 파일 읽기 (한 줄씩 읽기)
        populationStatistics.readByLine(path);

        // 자바 8 스타일로 한 줄씩 읽기
        populationStatistics.readByLine2(path);*/


        //List<PopulationMove> pml = populationStatistics.readByLine(path);

        /*for (PopulationMove pm: pml) {
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
        }
        System.out.println(pml.size());*/

        // 4-1. 파일 생성
        // populationStatistics.createAFile("from_to.txt");

        // 4-2. 파일에 내용 작성
        /*List<String> strings = new ArrayList<>();
        for (PopulationMove pm: pml) {
            // String으로 변환
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }

        System.out.println(strings.size());  // 몇 건인지 확인 👉 6209323
        populationStatistics.write(strings, "from_to.txt");*/

        // 새로운 파일 읽어보기
        String path = "./from_to.txt";
        List<PopulationMove> pml = populationStatistics.readByLine(path);
        for (PopulationMove pm: pml) {
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
        }
        System.out.println(pml.size());

    }
}
