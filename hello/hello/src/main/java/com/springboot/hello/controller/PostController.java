package com.springboot.hello.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample() {
        return "Hello Post API";
    }

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry map : postData.entrySet()) {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        }

        System.out.println("request가 호출 완료되었습니다.");

        return sb.toString();
    }

}
