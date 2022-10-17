package com.dbexercise.dao;

import com.dbexercise.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao {

    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection conn = DBUtil.getConnection();// db 연결
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        /*ps.setString(1, "1");
        ps.setString(2, "Soyeong");
        ps.setString(3, "1123");*/
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        int status = ps.executeUpdate();// ctrl + enter
        if(status == 1) {
            System.out.println("데이터 추가 성공");
        }
        ps.close();  // PreparedStatement 연결 끊어주기
        conn.close();
    }

    public void selectById(String sId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection();  // db 연결
            ps = conn.prepareStatement("SELECT id, name, password FROM users WHERE id = ?");
            ps.setString(1, sId);

            rs = ps.executeQuery();
            rs.next();
            User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            System.out.println("id = " + user.getId() + ", name = " + user.getName() + ", password = " + user.getPassword());
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
        // userDao.add(new User("1", "testId", "testPassword"));
        userDao.selectById("0");
//        userDao.selectAll();
    }

}
