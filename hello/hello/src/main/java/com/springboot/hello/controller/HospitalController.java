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
}
