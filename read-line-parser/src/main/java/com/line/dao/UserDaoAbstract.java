package com.line.dao;

import com.line.domain.User;

import java.sql.*;
import java.util.List;
import java.util.Map;

public abstract class UserDaoAbstract {
    public abstract Connection getConnection() throws SQLException;

    public List<User> selectAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<User> userList = null;

        try {
            conn = getConnection();  // db 연결
            ps = conn.prepareStatement("SELECT id, name, password FROM users");

            rs = ps.executeQuery();
            while(rs.next()) {
                User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
                userList.add(user);
                System.out.println(user.getId() + " " + user.getName() + " " + user.getPassword());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return userList;
    }

    public String selectById(String sId) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;

        try {
            conn = getConnection();  // db 연결
            ps = conn.prepareStatement("SELECT id, name, password FROM users WHERE id = ?");
            ps.setString(1, sId);

            rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
//                System.out.println(user.getId() + " " + user.getName() + " " + user.getPassword());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return user.getId() + " " + user.getName() + " " + user.getPassword();
    }

    public int insertData(User user) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        int status = 0;

        try {
            conn = getConnection();  // db 연결
            ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES (?, ?, ?)");
            ps.setString(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

            status = ps.executeUpdate();
            if(status == 1) {
                System.out.println("데이터 추가 성공");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ps.close();
            conn.close();
        }
        return status;
    }


}
