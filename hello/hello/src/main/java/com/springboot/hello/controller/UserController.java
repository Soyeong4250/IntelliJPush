package com.springboot.hello.controller;

import com.springboot.hello.domain.User;
import com.springboot.hello.dao.UserDao;
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
        return ResponseEntity
                .ok()
                .body(userDao.add(user));
    }


    @GetMapping("/find/{id}")
    public ResponseEntity<User> get(@PathVariable String id) {
        try {
            User user = this.userDao.selectById(id);
            return ResponseEntity.
                    ok().
                    body(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Integer> deleteAll() {
        return ResponseEntity
                .ok()
                .body(userDao.deleteAll());
    }



}
