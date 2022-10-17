package com.dbexercise;

import java.sql.*;
import java.util.Map;

public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);  // db 연결
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        ps.setString(1, "1");
        ps.setString(2, "Soyeong");
        ps.setString(3, "1123");

        int status = ps.executeUpdate();// ctrl + enter
        if(status == 1) {
            System.out.println("데이터 추가 성공");
        }
        ps.close();  // PreparedStatement 연결 끊어주기
        conn.close();
    }

    public void selectById(String sId) {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);  // db 연결
            ps = conn.prepareStatement("SELECT id, name, password FROM users WHERE id = ?");
            ps.setString(1, sId);

            rs = ps.executeQuery();
            if(rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                System.out.printf("id = %s, name = %s, password = %s\n", id, name, password);
                System.out.println("-----------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        // userDao.add();
        userDao.selectById("0");
    }
}
