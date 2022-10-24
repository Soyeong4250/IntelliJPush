package com.line.dao;

import com.line.domain.Hospital;
import com.line.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class HospitalDao {

    private final JdbcTemplate jdbcTemplate;

    public HospitalDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Hospital> selectAll() throws SQLException {
        String sql = "SELECT id, address, district, category, emergency_room, name, subdivision FROM seoul_hospital";
        RowMapper<Hospital> rowMapper = new RowMapper<Hospital>() {
            @Override
            public Hospital mapRow(ResultSet rs, int rowNum) throws SQLException {
                Hospital hospital = new Hospital(rs.getString("id"), rs.getString("address"), rs.getString("category"), rs.getInt("emergency_room"), rs.getString("name"));
                return hospital;
            }
        };

        return this.jdbcTemplate.query(sql, rowMapper);
    }

    public Hospital selectById(String sId) {
        String sql = "SELECT id, address, district, category, emergency_room, name, subdivision FROM seoul_hospital WHERE id = ?";
        RowMapper<Hospital> rowMapper = new RowMapper<Hospital>() {
            @Override
            public Hospital mapRow(ResultSet rs, int rowNum) throws SQLException {
                Hospital hospital = new Hospital(rs.getString("id"), rs.getString("address"), rs.getString("category"), rs.getInt("emergency_room"), rs.getString("name"));
                return hospital;
            }

        };
        return this.jdbcTemplate.queryForObject(sql, rowMapper, sId);
    }

    public int getCount() throws SQLException {
        return this.jdbcTemplate.queryForObject("SELECT COUNT(*) FROM seoul_hospital", Integer.class);
    }

    public void add(final Hospital hospital) throws SQLException {
        this.jdbcTemplate.update("INSERT IGNORE INTO seoul_hospital(id, address, district, category, emergency_room, name, subdivision) VALUES(?, ?, ?, ?, ?, ?, ?)",
                hospital.getId(), hospital.getAddress(), hospital.getDistrict(), hospital.getCategory(), hospital.getEmergencyRoom(), hospital.getName(), hospital.getSubdivision());
    }

    public void deleteAll() throws SQLException {
        this.jdbcTemplate.update("DELETE FROM hospital");
    }

}
