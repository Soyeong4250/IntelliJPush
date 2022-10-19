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
        UserDao userDao = new UserDaoFactory().awsUserDao();
        User user = new User("2", "Duhee", "2222");
        Assertions.assertEquals(userDao.insertData(user), 1);
    }

    @Test
    @DisplayName("userSelect 테스트")
    void searchByIdTest() throws SQLException {
        String sId = "1";
        UserDao userDao = new UserDaoFactory().awsUserDao();
        String result = userDao.selectById(sId);
        Assertions.assertEquals(result, "1 Soyeong 1234");
    }

}