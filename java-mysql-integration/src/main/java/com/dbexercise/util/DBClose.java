package com.dbexercise.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBClose {
    /*public static void close(Connection conn, PreparedStatement ps) throws SQLException {
        try {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    
    // ... : 인자값을 가변적으로 받을 수 있음
    // AutoCloseable : jdk 7 이상부터 가능
    public static void close(AutoCloseable...autoCloseable) {
        for (AutoCloseable ac : autoCloseable) {
            if(ac != null) {
                try {
                    ac.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
