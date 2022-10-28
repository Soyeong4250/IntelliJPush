package com.springboot.hello.controller;

import com.springboot.hello.domain.dto.MemberDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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

    @ApiOperation(value = "POST 메서드 예제", notes = "@RequestBody를 활용한 POST Method")
    @PostMapping(value = "/member2")
    public String postMemberDto(@ApiParam(value = "회원Dto", required = true) @RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

}
