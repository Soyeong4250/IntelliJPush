package com.line.dao;

public class UserDaoFactory {
    public UserDao awsUserDao() {
        ConnectionMaker connectionMaker = new AWSConnectionMaker();
        return new UserDao(connectionMaker);
    }
}
