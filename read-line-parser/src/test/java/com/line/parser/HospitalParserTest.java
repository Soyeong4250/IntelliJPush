package com.line.parser;

import com.line.domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospitalParserTest {
    String line1 = "\"A1120837\",\"서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)\",\"C\",\"의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"외과: 상시진료 내과는 당분간 휴진\",\"서울시 송파구 문정동 장지동 법조단지 위례 가락동 가락시장역 위치 삼성서울병원 외래교수 출신 구강외과 전문의 진료 진료과목 - 임플란트 치조골 뼈이식 수술 매복 사랑니 발치 턱관절 악관절 질환의 치료 교정 치료 및 기타 보존 보철(크라운 브릿지 인레이) 신경치료\",\"방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물\",\"가산기대찬의원\",\"02-6267-2580\",\"02-920-5374\",\"1930\",\"1930\",\"1930\",\"1930\",\"1930\",\"1500\",\"1500\",\"1500\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"1000\",\"1000\",\"085\",\"11\",\"126.88412249700781\",\"37.4803938036867\",\"2022-04-07 14:55:00.0\"";
    String line2 = "\"A1104130\",\"서울특별시 강남구 도산대로 118 (논현동 신사빌딩 2층)\",\"C\",\"의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"비만클리닉\",\"365일 진료 국민건강보험공단 검진 지정병원 점심시간 13~14시\",\"신사역 1번 출구 인근\",\"365엠씨의원\",\"02-516-3650\",\"02-920-5374\",\"2000\",\"2000\",\"1900\",\"2000\",\"2000\",\"1600\",\"1400\",\"1400\",\"1100\",\"1100\",\"1100\",\"1100\",\"1100\",\"1100\",\"900\",\"900\",\"60\",\"38\",\"127.0218085\",\"37.5166042\",\"54:49.0\"\n";
    String line4 = "\"A1118077\",\"서울특별시 중구 한강대로 416 지하1층 (남대문로5가 서울스퀘어빌딩)\",\"N\",\"치과의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"법정 공휴일 : 외래 진료 휴진 설날 및 추석 연휴 : 외래 진료 휴진 인공신장실은 정상 진료\",\"발 발목 무릎 어깨 상지  척추 특화 진료\",\"수도권 지하철 2호선 서울대입구역 4번 출구 10M\",\"연세건치과의원\",\"02-755-0882\",\"070-4665-9119\",\"1800\",\"1800\",\"1800\",\"1800\",\"1800\",\"1400\",\"1300\",\"1300\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"1000\",\"0900\",\"0900\",\"046\",\"37\",\"126.97375281464887\",\"37.5555048939659\",\"2022-09-07 14:55:29.0\"";
    void assertHospital(Hospital hospital, String eId, String eAddress, String eDistrict, String eCategory, int eEmergencyRoom, String eName, String eSubdivision) {

        // SQL insert문에 넣고 싶은 데이터 가공 로직 테스트
        Assertions.assertEquals(eId, hospital.getId());  // 우리가 insert할때 넣고 싶은 데이터
        Assertions.assertEquals(eAddress, hospital.getAddress());
        Assertions.assertEquals(eDistrict, hospital.getDistrict());
        Assertions.assertEquals(eCategory, hospital.getCategory());
        Assertions.assertEquals(eEmergencyRoom, hospital.getEmergencyRoom());
        Assertions.assertEquals(eName, hospital.getName());
        Assertions.assertEquals(eSubdivision, hospital.getSubdivision());
    }


    // Annotation : @로 시작하며, 특정 메소드에 기능을 넣어줌
    @Test
    @DisplayName("ID가 파싱이 잘 되는지")
    void hospitalParsing() {
        HospitalParser hospitalParser = new HospitalParser();
        Hospital hospital = hospitalParser.parse(this.line1);
//        String address = "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";
//        String district = "서울특별시 금천구";
//        String category = "C";
//        int emergencyRoom = 2;
//        String name = "가산기대찬의원";
//        String subdivision = "의원";

        assertHospital(hospitalParser.parse(this.line2), "A1104130", "서울특별시 강남구 도산대로 118 (논현동 신사빌딩 2층)", "서울특별시 강남구", "C", 2, "365엠씨의원", "의원");
    }

    @Test
    @DisplayName("Insert 쿼리를 잘 만드는지")
    void makeSqlQueryTest() {
        HospitalParser hospitalParser = new HospitalParser();
        Hospital hospital = hospitalParser.parse(this.line4);
        String sql = "INSERT IGNORE INTO `test-db`.`seoul_hospital`\n" +
                "(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n" +
                "VALUES\n" +
                "(\"A1118077\",\n" +
                "\"서울특별시 중구 한강대로 416 지하1층 (남대문로5가 서울스퀘어빌딩)\",\n" +
                "\"서울특별시 중구\",\n" +
                "\"N\",\n" +
                "2,\n" +
                "\"연세건치과의원\",\n" +
                "\"치과\")";
        // Assertions.assertEquals(sql, hospital.getSqlInsertQuery());

    }

}