package com.springboot.hello.controller;

import com.springboot.hello.domain.User;
import com.springboot.hello.domain.dao.UserDao;
import com.springboot.hello.domain.dto.UserDto;
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
    public ResponseEntity<Integer> register(@RequestBody UserDto userDto) {
        User user = new User(userDto.getId(), userDto.getName(), userDto.getPassword());
        log.info(userDto.toString() + "를 호출하였습니다.");
        userDao.add(user);
        return ResponseEntity
                .ok()
                .body(userDao.add(user));  // add 성공 시 반환값 int형이기 때문에
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Integer> deleteAll() {
        return ResponseEntity
                .ok()
                .body(userDao.deleteAll());
    }



}
