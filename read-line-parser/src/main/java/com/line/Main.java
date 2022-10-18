package com.line;

import com.line.dao.HospitalDao;
import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {

        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "C:\\TECHIT\\강의자료\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        // System.out.println(hospitals.size());

        /*for (Hospital hospital : hospitals) {
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
        // hospitalFileWriter.createSqlFile(sqlFileName);
        // hospitalFileWriter.writeLines(lines.toString(), sqlFileName);

        HospitalDao hospitalDao = new HospitalDao();
        hospitalDao.insertData(new Hospital("likelion", "서울특별시 종로구 종로3길 17 D타워, 16-17층", "T", 0, "멋쟁이사자처럼병원"));
        System.out.println("--------------------아이디 검색 결과---------------------");
        hospitalDao.selectById("likelion");
        System.out.println("--------------------전체 검색 결과---------------------");
        // hospitalDao.selectAll();

    }
}
