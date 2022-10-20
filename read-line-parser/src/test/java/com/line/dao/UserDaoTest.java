package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
    }

    @Test
    @DisplayName("UserInsert 테스트")
    void addTest() throws SQLException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        User user = new User("4", "test", "4444");
        Assertions.assertEquals(userDao.insertData(user), 1);
    }

    @Test
    @DisplayName("userSelect 테스트")
    void searchByIdTest() throws SQLException {
        String sId = "1";
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        String result = userDao.selectById(sId);
        Assertions.assertEquals(result, "1 Soyeong 1234");
    }

    @Test
    @DisplayName("getCount 테스트")
    void getCountTest() throws SQLException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        int cnt = userDao.getCount();
        Assertions.assertEquals(cnt, 3);
    }

    @Test
    @DisplayName("deleteAll 테스트")
    void deleteTest() throws SQLException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        int cnt = userDao.getCount();
        int status = userDao.deleteAll();
        Assertions.assertEquals(status, cnt);
    }

}