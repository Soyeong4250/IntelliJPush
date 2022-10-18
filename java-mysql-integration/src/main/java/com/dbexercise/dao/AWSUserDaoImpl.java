package com.dbexercise.dao;

import com.dbexercise.domain.User;
import com.dbexercise.util.DBClose;
import com.dbexercise.util.DBConnection;

import java.sql.*;
import java.util.Map;

public class AWSUserDaoImpl extends UserDaoAbstract {

    @Override
    public Connection getConnection() throws SQLException {
        Map<String, String> env = System.getenv();

        Connection conn = DriverManager.getConnection(env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD"));
        return conn;
    }

}
