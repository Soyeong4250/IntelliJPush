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

        // 확인
        /*System.out.println(hospitals.size());

        for (Hospital hospital : hospitals) {
            System.out.printf("%s, %s, %s, %s, %d, %s, %s\n",
                    hospital.getId(), hospital.getAddress(), hospital.getDistrict(),
                    hospital.getCategory(), hospital.getEmergencyRoom(), hospital.getName(),
                    hospital.getSubdivision());
        }*/

//        List<String> lines = new ArrayList<>();
//        for (Hospital hospital : hospitals) {
//            lines.add(hospital.getSqlInsertQuery());
//        }

        StringBuilder lines = new StringBuilder();

        for (Hospital hospital : hospitals) {
            if(lines.length() == 0) {
                lines.append(hospital.getSqlInsertQuery());
            } else {
                lines.append("," + hospital.getTupleString());
            }
        }
        lines.append(";");
        FileWriter<Hospital> hospitalFileWriter = new FileWriter<>();
        String sqlFileName = "hospital_insert.sql";
        hospitalFileWriter.createSqlFile(sqlFileName);
        hospitalFileWriter.writeLines(lines.toString(), sqlFileName);

    }
}
