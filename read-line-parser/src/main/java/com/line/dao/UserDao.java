package com.line.dao;

import com.line.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private final JdbcTemplate jdbcTemplate;


    public UserDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<User> selectAll() throws SQLException {
       String sql = "SELECT * FROM users";
       RowMapper<User> rowMapper = new RowMapper<User>() {
           @Override
           public User mapRow(ResultSet rs, int rowNum) throws SQLException {
               User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
               return user;
           }
       };

       return this.jdbcTemplate.query(sql, rowMapper);
    }

    public User selectById(String sId) {
        String sql = "SELECT * FROM users WHERE id = ?";
        RowMapper<User> rowMapper = new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
                return user;
            }

        };
        return this.jdbcTemplate.queryForObject(sql, rowMapper, sId);
    }

    public int getCount() throws SQLException {
        return this.jdbcTemplate.queryForObject("SELECT COUNT(*) FROM users", Integer.class);
    }

    public void add(final User user) throws SQLException {
        this.jdbcTemplate.update("INSERT INTO users(id, name, password) VALUES(?, ?, ?)", user.getId(), user.getName(), user.getPassword());
    }

    public void deleteAll() throws SQLException {
        this.jdbcTemplate.update("DELETE FROM users");
    }


}
