package com.springboot.hello.controller;

import com.springboot.hello.domain.User;
import com.springboot.hello.domain.dao.UserDao;
import com.springboot.hello.domain.dto.UserRegisterPostReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {

    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping("/register")
    public ResponseEntity<Integer> register(@RequestBody UserRegisterPostReq registerInfo) {
        User user = new User(registerInfo.getId(), registerInfo.getName(), registerInfo.getPassword());
        log.info(registerInfo.toString() + "를 호출하였습니다.");
        userDao.add(user);
        return ResponseEntity
                .ok()
                .body(userDao.add(user));
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Integer> deleteAll() {
        return ResponseEntity
                .ok()
                .body(userDao.deleteAll());
    }



}
