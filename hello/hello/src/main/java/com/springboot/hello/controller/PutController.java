package com.springboot.hello.controller;

import com.springboot.hello.domain.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {
    @PutMapping(value = "/member")
    public String putMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry map : putData.entrySet()) {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        }

        System.out.println("request가 호출 완료되었습니다.");

        return sb.toString();
    }

    @PutMapping(value = "/member2")
    public String putMemberDto(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    @PutMapping(value = "/member3")
    public ResponseEntity<MemberDto> postMemberDto3(@RequestBody MemberDto memberDto) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(memberDto);
    }
}
