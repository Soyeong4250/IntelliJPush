package com.line.dao;

import java.sql.*;
import java.util.Map;

public class ConnectionMaker {
    private static final Map<String, String> env = System.getenv();
    private static final String dbHost = env.get("DB_HOST");
    private static final String dbUser = env.get("DB_USER");
    private static final String dbPassword = env.get("DB_PASSWORD");

    public ConnectionMaker() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbHost, dbUser, dbPassword);
    }

}
