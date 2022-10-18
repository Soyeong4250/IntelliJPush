package com.line.dao;

import com.line.domain.Hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class HospitalDao {

    private AWSConnectionMaker awsConnectionMaker;

    public HospitalDao() {
        this.awsConnectionMaker = new AWSConnectionMaker();
    }

    public List<Hospital> selectAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Hospital> hospitalList = null;

        try {
            conn = awsConnectionMaker.getConnection();  // db 연결
            ps = conn.prepareStatement("SELECT id, address, district, category, emergency_room, name, subdivision FROM seoul_hospital");

            rs = ps.executeQuery();
            while(rs.next()) {
                Hospital hospital = new Hospital(rs.getString("id"), rs.getString("address"), rs.getString("category"), rs.getInt("emergency_room"), rs.getString("name"));
                hospitalList.add(hospital);
                System.out.println(hospital.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionClose.close(conn, ps, rs);
        }
        return hospitalList;
    }

    public String selectById(String sId) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Hospital hospital = null;

        try {
            conn = awsConnectionMaker.getConnection();  // db 연결
            ps = conn.prepareStatement("SELECT id, address, district, category, emergency_room, name, subdivision FROM seoul_hospital WHERE id = ?");
            ps.setString(1, sId);

            rs = ps.executeQuery();
            if(rs.next()) {
                hospital = new Hospital(rs.getString("id"), rs.getString("address"), rs.getString("category"), rs.getInt("emergency_room"), rs.getString("name"));
                System.out.println(hospital.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionClose.close(conn, ps, rs);
        }
        return hospital.toString();
    }

    public int insertData(Hospital hospital) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int status = 0;

        try {
            conn = awsConnectionMaker.getConnection();// db 연결
            ps = conn.prepareStatement("INSERT IGNORE INTO seoul_hospital(id, address, district, category, emergency_room, name, subdivision) VALUES(?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, hospital.getId());
            ps.setString(2, hospital.getAddress());
            ps.setString(3, hospital.getDistrict());
            ps.setString(4, hospital.getCategory());
            ps.setInt(5, hospital.getEmergencyRoom());
            ps.setString(6, hospital.getName());
            ps.setString(7, hospital.getSubdivision());

            status = ps.executeUpdate();// ctrl + enter
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
}
