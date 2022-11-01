package com.springboot.hello.domain.dao;

import com.springboot.hello.domain.Hospital;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;


@Component
public class HospitalDao {

    private final JdbcTemplate jdbcTemplate;

    public HospitalDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 11만건의 데이터를 List<Hospital>에서 Hospital로 꺼내어 insert()
    public void add(Hospital hospital) {
        String sql = "insert into `testdb`.`nation_wide_hospitals` (`id`, `open_service_name`, `open_local_government_code`,\n" +
                "`management_number`, `license_date`, `business_status`, `business_status_code`, `phone`, `full_address`, `road_name_address`, `hospital_name`,\n" +
                "`business_type_name`, `healthcare_provider_count`, `patient_room_count`, `total_number_of_beds`,\n" +
                "`total_area_size`) " +
                "values (?, ?, ?, ?, ?, ?, ?,\n" +
                "?, ?, ?, ?, ?, ?, ?, ?, ?)\n" +
                " on duplicate key update `id`=?;";
        this.jdbcTemplate.update(sql, hospital.getId(), hospital.getOpenServiceName(), hospital.getOpenLocalGovernmentCode(),
                hospital.getManagementNumber(), hospital.getLicenseDate(), hospital.getBusinessStatus(), hospital.getBusinessStatusCode(), hospital.getPhone(), hospital.getFullAddress(), hospital.getRoadNameAddress(), hospital.getHospitalName(),
                hospital.getBusinessTypeName(), hospital.getHealthcareProviderCnt(), hospital.getPatientRoomCnt(), hospital.getTotalNumberOfBeds(), hospital.getTotalAreaSize(), hospital.getId());
    }

    public Hospital selectById(String sId) {
        String sql = "select * from `testdb`.`nation_wide_hospitals` where `id`=?";
        RowMapper<Hospital> rowMapper = new RowMapper<Hospital>() {
            @Override
            public Hospital mapRow(ResultSet rs, int rowNum) throws SQLException {
                Hospital hospital = new Hospital(rs.getInt("id"), rs.getString("open_service_name"), rs.getInt("open_local_government_code"),
                        rs.getString("management_number"), rs.getObject("license_date", LocalDateTime.class), rs.getInt("business_status"),  rs.getInt("business_status_code"),  rs.getString("phone"),  rs.getString("full_address"),  rs.getString("road_name_address"),
                        rs.getString("hospital_name"),  rs.getString("business_type_name"),  rs.getInt("healthcare_provider_count"),  rs.getInt("patient_room_count"), rs.getInt("total_number_of_beds"), rs.getFloat("total_area_size"));
                return hospital;
            }
        };

        return this.jdbcTemplate.queryForObject(sql, rowMapper, sId);
    }

    public int deleteAll() {
        String sql = "delete from `testdb`.`nation_wide_hospitals`;";
        return this.jdbcTemplate.update(sql);
    }

    public int getCount() {
        String sql = "select count(id) from `testdb`.`nation_wide_hospitals`;";
        return this.jdbcTemplate.queryForObject(sql, Integer.class);
    }
}
