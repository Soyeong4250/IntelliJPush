package com.line.dao;

import com.line.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class UserDao {

    private DataSource dataSource;

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void jdbcContextWithStatementStrategy(StatementStrategy st) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = dataSource.getConnection();
            ps = st.makePreparedStatement(conn);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionClose.close(conn, ps);
        }
    }

    public List<User> selectAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<User> userList = null;

        try {
            conn = dataSource.getConnection();  // db 연결
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
            conn = dataSource.getConnection();  // db 연결
            ps = conn.prepareStatement("SELECT id, name, password FROM users WHERE id = ?");
            ps.setString(1, sId);

            rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
//                System.out.println(user.getId() + " " + user.getName() + " " + user.getPassword());
            }
            if(user == null) {
                throw new EmptyResultDataAccessException(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionClose.close(conn, ps, rs);
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
            conn = dataSource.getConnection();  // db 연결
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

    public void add(final User user) throws SQLException {
        jdbcContextWithStatementStrategy(new StatementStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection conn) throws SQLException {
                PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?);");
                ps.setString(1, user.getId());
                ps.setString(2, user.getName());
                ps.setString(3, user.getPassword());

                return ps;
            }
        });
    }

    public void deleteAll() {
        jdbcContextWithStatementStrategy(new StatementStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection conn) throws SQLException {
                return conn.prepareStatement("DELETE FROM users");
            }
        });
    }


}
