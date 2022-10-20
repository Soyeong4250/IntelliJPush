package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;

import java.sql.*;
import java.util.List;

public class UserDao {

    private ConnectionMaker connectionMaker;


    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public List<User> selectAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<User> userList = null;

        try {
            conn = connectionMaker.getConnection();  // db 연결
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
            ConnectionClose.close(conn, ps, rs);
        }
        return userList;
    }

    public User selectById(String sId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;

        try {
            conn = connectionMaker.getConnection();  // db 연결
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
            ConnectionClose.close(conn, ps, rs);
        }

        if(user == null) {
            throw new EmptyResultDataAccessException(1);
        }
        System.out.println(user.getId() + " " + user.getName() + " " + user.getPassword());
        return user;
    }

    public int getCount() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;

        try {
            conn = connectionMaker.getConnection();  // db 연결
            ps = conn.prepareStatement("SELECT COUNT(*) FROM users");
            rs = ps.executeQuery();

            if(rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionClose.close(conn, ps, rs);
        }
        return count;
    }

    public int insertData(User user) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        int status = 0;

        try {
            conn = connectionMaker.getConnection();  // db 연결
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
            ConnectionClose.close(conn, ps);
        }
        return status;
    }

    public int deleteAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        int status = 0;

        try {
            conn = connectionMaker.getConnection();
            ps = conn.prepareStatement("DELETE FROM users");

            status = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionClose.close(conn, ps);
        }

        return status;
    }


}
