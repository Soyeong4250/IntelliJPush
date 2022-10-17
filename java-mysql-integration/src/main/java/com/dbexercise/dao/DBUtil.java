package com.dbexercise.dao;

import java.sql.*;
import java.util.Map;

public class DBUtil {
    private static Connection conn;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if(conn == null) {
            Map<String, String> env = System.getenv();
            String dbHost = env.get("DB_HOST");
            String dbUser = env.get("DB_USER");
            String dbPassword = env.get("DB_PASSWORD");
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        }

        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
