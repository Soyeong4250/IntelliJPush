package com.springboot.hello.controller;

import com.springboot.hello.domain.Hospital;
import com.springboot.hello.dao.HospitalDao;
import com.springboot.hello.domain.dto.HospitalDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hospital")
public class HospitalController {

    private final HospitalDao hospitalDao;

    public HospitalController(HospitalDao hospitalDao) {
        this.hospitalDao = hospitalDao;
    }

    @PostMapping("/register")
    public ResponseEntity<Integer> register(@RequestBody HospitalDto hospitalDto) {
        Hospital hospital = new Hospital(hospitalDto.getId(), hospitalDto.getOpenServiceName(), hospitalDto.getOpenLocalGovernmentCode(),
                hospitalDto.getManagementNumber(), hospitalDto.getLicenseDate(), hospitalDto.getBusinessStatus(), hospitalDto.getBusinessStatusCode(), hospitalDto.getPhone(), hospitalDto.getFullAddress(), hospitalDto.getRoadNameAddress(), hospitalDto.getHospitalName(),
                hospitalDto.getBusinessTypeName(), hospitalDto.getHealthcareProviderCnt(), hospitalDto.getPatientRoomCnt(), hospitalDto.getTotalNumberOfBeds(), hospitalDto.getTotalAreaSize());
        return ResponseEntity
                .ok()
                .body(hospitalDao.add(hospital));
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Hospital> findById(@PathVariable int id) {
        Hospital hospital = hospitalDao.selectById(id);

        if(hospital == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity
                .ok()
                .body(hospital);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Integer> deleteById(@PathVariable int id) {
        Hospital hospital = hospitalDao.selectById(id);

        if(hospital == null) {
            return ResponseEntity.notFound().build();
        }
        hospitalDao.deleteById(id);
        return ResponseEntity
                .ok()
                .body(hospitalDao.deleteAll());
    }
}
