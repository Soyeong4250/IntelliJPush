package com.dbexercise.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class DBConnection {  // db 연결 클래스
    private static final Map<String, String> env = System.getenv();
    private static final String dbHost = env.get("DB_HOST");
    private static final String dbUser = env.get("DB_USER");
    private static final String dbPassword = env.get("DB_PASSWORD");

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbHost, dbUser, dbPassword);
    }
}
