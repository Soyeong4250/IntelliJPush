package com.line.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {
    @Bean
    public UserDao awsUserDao() {
        ConnectionMaker connectionMaker = new AWSConnectionMaker();
        return new UserDao(connectionMaker);
    }

    @Bean
    public UserDao localUserDao() {
        ConnectionMaker connectionMaker = new LocalConnectionMaker();
        return new UserDao(connectionMaker);
    }
}
