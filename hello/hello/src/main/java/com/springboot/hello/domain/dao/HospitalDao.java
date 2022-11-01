package com.springboot.hello.domain.dao;

import com.springboot.hello.domain.Hospital;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


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


    public int getCount() {
        String sql = "select count(id) from `testdb`.`nation_wide_hospitals`;";
        return this.jdbcTemplate.queryForObject(sql, Integer.class);
    }
}
