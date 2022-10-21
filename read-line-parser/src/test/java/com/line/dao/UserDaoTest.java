package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;
    UserDao userDao;

    @BeforeEach
    void setUp() throws SQLException {
        this.userDao = context.getBean("awsUserDao", UserDao.class);
        userDao.deleteAll();
        userDao.add(new User("0", "Soyeong", "0000"));
        System.out.println("Before Each");
    }

    @Test
    @DisplayName("User가 null인 경우")
    void findById() {
        assertThrows(EmptyResultDataAccessException.class, () -> {
            userDao.selectById("100");
        });
    }

    @Test
    @DisplayName("add, select 테스트")
    void addAndSelect() throws SQLException {
        assertEquals(1, userDao.getCount());

        User user1 = new User("1", "kyeonghwan", "1123");
        userDao.add(user1);
        assertEquals(2, userDao.getCount());
        User user = userDao.selectById(user1.getId());

        assertEquals(user1.getName(), user.getName());
        assertEquals(user1.getPassword(), user.getPassword());
    }

    @Test
    @DisplayName("getCount 테스트")
    void getCountTest() throws SQLException {
        int cnt = userDao.getCount();
        assertEquals(1, cnt);
        userDao.add(new User("1", "kyeonghwan", "1234"));
        assertEquals(2, userDao.getCount());
        userDao.add(new User("2", "sujin", "4321"));
        assertEquals(3, userDao.getCount());
    }

    @Test
    @DisplayName("deleteAll 테스트")
    void deleteTest() throws SQLException {
        userDao.deleteAll();
        assertEquals(0, userDao.getCount());
    }

}