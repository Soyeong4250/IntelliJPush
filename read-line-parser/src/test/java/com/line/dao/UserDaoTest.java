package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    @DisplayName("UserInsert 테스트")
    void addTest() throws SQLException {
        // 기본으로 AWSConnectionMaker()를 할당받기는 하지만 UserDao의 오버로딩이 잘 작동하는지 확인하기 위해 매개변수로 받아봄
        UserDao userDao = new UserDao(new AWSConnectionMaker());  
        User user = new User("1", "Soyeong", "1234");
        Assertions.assertEquals(userDao.insertData(user), 1);
    }

    @Test
    @DisplayName("userSelect 테스트")
    void searchByIdTest() throws SQLException {
        String sId = "1";
        UserDao userDao = new UserDao();
        String result = userDao.selectById(sId);
        Assertions.assertEquals(result, "1 Soyeong 1234");
    }

}