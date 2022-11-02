package com.springboot.hello.parser;

import com.springboot.hello.domain.Hospital;
import com.springboot.hello.dao.HospitalDao;
import com.springboot.hello.service.HospitalService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HospitalParserTest {

    String line1 = "\"1\",\"의원\",\"01_01_02_P\",\"3620000\",\"PHMA119993620020041100004\",\"19990612\",\"\",\"01\",\"영업/정상\",\"13\",\"영업중\",\"\",\"\",\"\",\"\",\"062-515-2875\",\"\",\"500881\",\"광주광역시 북구 풍향동 565번지 4호 3층\",\"광주광역시 북구 동문대로 24, 3층 (풍향동)\",\"61205\",\"효치과의원\",\"20211115113642\",\"U\",\"2021-11-17 02:40:00.0\",\"치과의원\",\"192630.735112\",\"185314.617632\",\"치과의원\",\"1\",\"0\",\"0\",\"52.29\",\"401\",\"치과\",\"\",\"\",\"\",\"0\",\"0\",\"\",\"\",\"0\",\"\",";
    String line2 = "\"2\",\"의원\",\"01_01_02_P\",\"3620000\",\"PHMA119993620020041100005\",\"19990707\",\"\",\"01\",\"영업/정상\",\"13\",\"영업중\",\"\",\"\",\"\",\"\",\"062-574-2802\",\"\",\"500867\",\"광주광역시 북구 일곡동 821번지 1호 2층\",\"광주광역시 북구 설죽로 518, 2층 (일곡동)\",\"61041\",\"일곡부부치과의원\",\"20170905183213\",\"I\",\"2018-08-31  11:59:59 PM\",\"치과의원\",\"190646.777107\",\"189589.427851\",\"치과의원\",\"2\",\"0\",\"0\",\"200\",\"401\",\"치과\",\"\",\"\",\"\",\"0\",\"0\",\"\",\"\",\"0\",\"\",";
    // String line770 = "\"769\",\"의원\",\"01_01_02_P\",\"5710000\",\"PHMA119964360069041100011\",\"19960328\",\"\",\"01\",\"영업/정상\",\"13\",\"영업중\",\"\",\"\",\"\",\"\",\"298-8007\",\"\",\"360812\",\"충청북도 청주시 상당구 용암동 2627번지\",\"충청북도 청주시 상당구 중고개로 181, 2층 (용암동)\",\"28763\",\"상당이비인후과의원\",\"20170905183708\",\"I\",\"2018-08-31 23:59:59.0\",\"의원\",\"245973.624694\",\"346712.43852\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",";

    @Autowired
    ReadLineContext<Hospital> hospitalReadLineContext;

    @Autowired
    HospitalDao hospitalDao;

    @Autowired
    HospitalService hospitalService;

    @Test
    @Order(3)
    @DisplayName("Hospital이 insert가 잘 되는지")
    void add() {
        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parse(line1);
        Hospital hospital2 = hp.parse(line2);
        hospitalDao.add(hospital);
        hospitalDao.add(hospital2);
        assertEquals(2, hospitalDao.getCount());
    }

    @Test
    @Order(4)
    @DisplayName("찾고자 하는 병의원 데이터가 잘나오는지")
    void selectById() {
        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parse(line1);
        Hospital selectedHospital = hospitalDao.selectById(hospital.getId());
        assertEquals(selectedHospital.getId(), hospital.getId());
        assertEquals(selectedHospital.getOpenServiceName(), hospital.getOpenServiceName());

        assertEquals(selectedHospital.getOpenLocalGovernmentCode(),hospital.getOpenLocalGovernmentCode());
        assertEquals(selectedHospital.getManagementNumber(),hospital.getManagementNumber());
        assertEquals(selectedHospital.getBusinessStatus(), hospital.getBusinessStatus()); // idx:7
        assertEquals(selectedHospital.getBusinessStatusCode(), hospital.getBusinessStatusCode());

        assertTrue(selectedHospital.getLicenseDate().isEqual(hospital.getLicenseDate()));

        assertEquals(selectedHospital.getPhone(), hospital.getPhone());
        assertEquals(selectedHospital.getFullAddress(), hospital.getFullAddress());
        assertEquals(selectedHospital.getRoadNameAddress(), hospital.getRoadNameAddress());
        assertEquals(selectedHospital.getHospitalName(), hospital.getHospitalName());
        assertEquals(selectedHospital.getBusinessTypeName(), hospital.getBusinessTypeName());
        assertEquals(selectedHospital.getHealthcareProviderCnt(), hospital.getHealthcareProviderCnt());
        assertEquals(selectedHospital.getPatientRoomCnt(), hospital.getPatientRoomCnt());
        assertEquals(selectedHospital.getTotalNumberOfBeds(), hospital.getTotalNumberOfBeds());
        assertEquals(selectedHospital.getTotalAreaSize(), hospital.getTotalAreaSize());
    }

    @Test
    @Order(5)
    @DisplayName("병의원 데이터수 세기")
    void getCount() {
        System.out.printf("전국 병의원 데이터 수 : %d", hospitalDao.getCount());
        assertEquals(2, hospitalDao.getCount());
    }

    @Test
    @Order(6)
    @DisplayName("모든 데이터 삭제 테스트")
    void deleteAll() {
        hospitalDao.deleteAll();
        assertEquals(0, hospitalDao.getCount());
    }

    @Test
    @Order(1)
    @DisplayName("10만건 이상 데이터 파싱 테스트")
    void onHundredThousandRows() throws IOException {
        String filename = "C:\\TECHIT\\fulldata_01_01_02_P_의원.csv";
        /* List<Hospital> hospitalList = hospitalReadLineContext.readLineParser(filename);
        System.out.printf("파싱된 데이터 개수 : %d", hospitalList.size());
        assertTrue(hospitalList.size() > 1000);
        assertTrue(hospitalList.size() > 10000);*/
        /*for (int i = 0; i < 10; i++) {
            System.out.println(hospitalList.get(i).getHospitalName());
        }*/

        int cnt = this.hospitalService.insertLargeVolumeHospitalData(filename);
        assertTrue(cnt > 1000);
        assertTrue(cnt > 10000);
        System.out.printf("파싱된 데이터 개수 : %d", cnt);
    }

    @Test
    @Order(2)
    @DisplayName("csv 1줄 hospital로 잘 만드는지 테스트")
    void convertToHospital() {
        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parse(line1);

        assertEquals(1, hospital.getId());  // 0
        assertEquals("의원", hospital.getOpenServiceName());  // 1
        assertEquals(3620000,hospital.getOpenLocalGovernmentCode());  // 3
        assertEquals("PHMA119993620020041100004",hospital.getManagementNumber());  // 4
        assertEquals(LocalDateTime.of(1999, 6, 12, 0, 0, 0), hospital.getLicenseDate()); // 5
        assertEquals(1, hospital.getBusinessStatus());  // 7
        assertEquals(13, hospital.getBusinessStatusCode());  // 9
        assertEquals("062-515-2875", hospital.getPhone());  // 15
        assertEquals("광주광역시 북구 풍향동 565번지 4호 3층", hospital.getFullAddress());  // 18
        assertEquals("광주광역시 북구 동문대로 24, 3층 (풍향동)", hospital.getRoadNameAddress());  // 19
        assertEquals("효치과의원", hospital.getHospitalName());  // 21
        assertEquals("치과의원", hospital.getBusinessTypeName());  // 25
        assertEquals(1, hospital.getHealthcareProviderCnt());  // 29
        assertEquals(0, hospital.getPatientRoomCnt());  // 30
        assertEquals(0, hospital.getTotalNumberOfBeds());  // 31
        assertEquals(52.29f, hospital.getTotalAreaSize());  // 32
    }
    
}