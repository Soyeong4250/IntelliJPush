package com.line.dao;

import java.sql.*;
import java.util.Map;

public class AWSConnectionMaker implements ConnectionMaker{

    public AWSConnectionMaker() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");
        return DriverManager.getConnection(dbHost, dbUser, dbPassword);
    }

}
