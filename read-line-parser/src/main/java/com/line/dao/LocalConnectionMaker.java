package com.line.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocalConnectionMaker implements ConnectionMaker{

    @Override
    public Connection getConnection() throws SQLException {
        String dbHost = "jdbc:mysql://localhost:3306/test-db";
        String dbUser = "";
        String dbPassword = "";
        return DriverManager.getConnection(dbHost, dbUser, dbPassword);
    }
}
