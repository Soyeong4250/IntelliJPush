package com.line.dao;

import com.line.domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class HospitalDaoTest {
    @Test
    @DisplayName("insert 테스트")
    void addTest() {
        HospitalDao hospitalDao = new HospitalDao();
        Hospital hospital = new Hospital("Testdata", "서울특별시 종로구 종로3길 17 D타워, 16-17층", "T", 0, "멋사소아과의원");
        Assertions.assertEquals(hospitalDao.insertData(hospital), 1);
    }

    @Test
    @DisplayName("select 테스트")
    void searchByIdTest() throws SQLException {
        String sId = "Testdata";
        HospitalDao hospitalDao = new HospitalDao();
        String result = hospitalDao.selectById(sId);
        Assertions.assertEquals(result, "Hospital{id='Testdata', address='서울특별시 종로구 종로3길 17 D타워, 16-17층', district='서울특별시 종로구', category='T', emergencyRoom=0, name='멋사소아과의원', subdivision='소아'}");
    }

}