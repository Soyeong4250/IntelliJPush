package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        // 1. 파일을 읽기 위해서는 파일을 읽을 수 있는 객체 생성 👉 LineReader라는 객체를 생성하자!
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "C:\\TECHIT\\강의자료\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        // 9. 데이터가 잘 들어왔는지 확인하기 위해 (데이터가 몇건인지)List의 사이즈를 출력해보자
        // 👉 19039 가 출력되어야 함
        // System.out.println(hospitals.size());

        // 👇 모든 데이터를 출력해보는 코드
        /*for (Hospital hospital : hospitals) {
            System.out.printf("%s, %s, %s, %s, %d, %s, %s\n",
                    hospital.getId(), hospital.getAddress(), hospital.getDistrict(),
                    hospital.getCategory(), hospital.getEmergencyRoom(), hospital.getName(),
                    hospital.getSubdivision());
        }*/

        // 10. 받아온 데이터를 이용하여 sql문을 생성해보자 👉 Hospital클래스 이동
        // 12. Hospital 객체에 구현한 getSqlInserQuery()메서드를 이용하여 insert문을 생성해보자
//        List<String> lines = new ArrayList<>();
//        for (Hospital hospital : hospitals) {
//            lines.add(hospital.getSqlInsertQuery());
//        }

        // 12-1. Hospital 객체의 getSqlInserQuery()메서드와
        // getTupleString() 메서드를 이용하여 더 빠른 insert문을 생성해보자
        StringBuilder lines = new StringBuilder();

        for (Hospital hospital : hospitals) {
            if(lines.length() == 0) {
                lines.append(hospital.getSqlInsertQuery());
            } else {
                lines.append("," + hospital.getTupleString());
            }
        }
        lines.append(";");  // insert문 마지막에 ";" 필수로 들어가야 함

        // 13. 새로운 파일을 작성하고 SQL문을 저장해보자. 👉 FileWriter 클래스
        // 16. FileWriter 클래스를 이용하여 파일을 생성하고 SQL문을 저장하자
        FileWriter<Hospital> hospitalFileWriter = new FileWriter<>();
        String sqlFileName = "hospital_insert.sql";
        hospitalFileWriter.createSqlFile(sqlFileName);
        hospitalFileWriter.writeLines(lines.toString(), sqlFileName);
        // 17. "hospital_insert.sql" 파일이 생성되었는지 왼쪽의 프로젝트 익스플로어를 확인해보자

    }
}
